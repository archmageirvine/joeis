package irvine.oeis.a051;

import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import irvine.math.api.Matrix;
import irvine.math.group.MatrixField;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.Triple;

/**
 * A051787 Expected number of spins in a 2-player Dreidel game (rounded to nearest integer).
 * @author Sean A. Irvine
 */
public class A051787 implements Sequence {

  // This sequence is a nice example of determining the expected length of a Markov chain.

  // Represent the state of the game by a triple (a,b,p) where "a" is the number of nuts
  // of the player whose turn will be next, "b" is the number of nuts of the other player,
  // and "p" is the number of nuts in the pot.

  // We construct one minus the transition matrix for the non-absorbing states, and then
  // invert the matrix to get the fundamental matrix. From this we can compute the
  // expected number of turns.

  private static final Q NEG_QUARTER = Q.ONE_QUARTER.negate();

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private int mNuts = 0;

  protected int add() {
    return 0;
  }

  private Triple<Integer> createState(final int a, final int b, final int p) {
    return p != 0 ? new Triple<>(a, b, p) : new Triple<>(a - 1, b - 1, 2);
  }

  private boolean isAbsorbing(final Triple<Integer> state) {
    return state.left() <= 0 || state.mid() <= 0;
  }

  private int id(final Map<Triple<Integer>, Integer> stateToId, final Triple<Integer> state) {
    final Integer id = stateToId.get(state);
    if (id != null) {
      return id;
    }
    final int res = stateToId.size();
    stateToId.put(state, res);
    return res;
  }

  private Matrix<Q> buildMatrix(final int nuts) {
    final Map<Triple<Integer>, Integer> stateToId = new HashMap<>();
    final List<List<Integer>> transitions = new ArrayList<>();
    final Deque<Triple<Integer>> queue = new LinkedList<>();
    final Triple<Integer> initial = createState(nuts, nuts, 0);
    id(stateToId, initial);
    queue.add(initial);
    while (!queue.isEmpty()) {
      final Triple<Integer> state = queue.pollFirst();
      if (!isAbsorbing(state)) {
        final int id = id(stateToId, state);
        while (id >= transitions.size()) {
          transitions.add(new ArrayList<>());
        }
        final Triple<Integer> nothing = createState(state.mid(), state.left(), state.right());
        //System.out.println(state + " -> " + nothing + " noop " + isTerminal(nothing));
        if (!stateToId.containsKey(nothing)) {
          queue.add(nothing);
        }
        transitions.get(id).add(id(stateToId, nothing)); // this state is never terminal
        final int half = (state.right() + add()) / 2;
        final Triple<Integer> takeHalfPot = createState(state.mid(), state.left() + half, state.right() - half);
        if (!stateToId.containsKey(takeHalfPot)) {
          queue.add(takeHalfPot);
        }
        if (!isAbsorbing(takeHalfPot)) {
          transitions.get(id).add(id(stateToId, takeHalfPot));
        }
        final Triple<Integer> takeFullPot = createState(state.mid(), state.left() + state.right(), 0);
        if (!stateToId.containsKey(takeFullPot)) {
          queue.add(takeFullPot);
        }
        if (!isAbsorbing(takeFullPot)) {
          transitions.get(id).add(id(stateToId, takeFullPot));
        }
        final Triple<Integer> putIn = createState(state.mid(), state.left() - 1, state.right() + 1);
        if (!stateToId.containsKey(putIn)) {
          queue.add(putIn);
        }
        if (!isAbsorbing(putIn)) {
          transitions.get(id).add(id(stateToId, putIn));
        }
      }
    }
    final int n = transitions.size();
    final DefaultMatrix<Q> mat = new DefaultMatrix<>(n, n, Q.ZERO);
    for (int k = 0; k < n; ++k) {
      for (final int j :  transitions.get(k)) {
        mat.set(k, j, mat.get(k, j).add(NEG_QUARTER));
      }
    }
    // Effectively add identity
    for (int k = 0; k < n; ++k) {
      mat.set(k, k, mat.get(k, k).add(Q.ONE));
    }
    //System.out.println(mat);
    return mat;
  }

  @Override
  public Z next() {
    if (++mNuts == 1) {
      return Z.ZERO; // initial state is already terminal
    }
    final Matrix<Q> mat = buildMatrix(mNuts);
    final MatrixField<Q> field = new MatrixField<>(mat.rows(), Rationals.SINGLETON);
    final Matrix<Q> fundamental = field.inverse(mat);
    // Row 0 corresponds to start state
    Q expected = Q.ZERO;
    for (int k = 0; k < fundamental.cols(); ++k) {
      expected = expected.add(fundamental.get(0, k));
    }
    if (mVerbose) {
      System.out.println("a(" + mNuts + ")=round(" + expected + ")");
    }
    return expected.round();
  }
}
