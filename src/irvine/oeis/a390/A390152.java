package irvine.oeis.a390;

import java.util.HashMap;
import java.util.Map;

import irvine.math.api.Matrix;
import irvine.math.group.MatrixField;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.Pair;

/**
 * A390152 Numerator of average duration of the game "Tug of Luck" played with n coins.
 * @author Sean A. Irvine
 */
public class A390152 extends Sequence1 {

  // Another nice example of solving a Markov chain expected value problem

  private int mN = 0;

  protected Z select(final Q n) {
    //System.out.println(mN + " " + n);
    return n.num();
  }

  @Override
  public Z next() {
    if (++mN == 1) {
      return select(Q.ZERO);
    }
    // Exploits symmetry, so player 1 never has more coins than player 2
    final HashMap<Pair<Integer, Integer>, Integer> stateToRow = new HashMap<>();
    for (int totalCoins = mN, s = 0; totalCoins >= 2; totalCoins -= 2) { // We can only ever lose 2 coins at a time
      for (int player1Coins = 1; 2 * player1Coins <= totalCoins; ++player1Coins, ++s) {
        stateToRow.put(new Pair<>(player1Coins, totalCoins - player1Coins), s);
      }
    }
    final int states = stateToRow.size();
    final DefaultMatrix<Q> q = new DefaultMatrix<>(states, states, Q.ZERO);
    // Update q with transition probabilities
    for (final Map.Entry<Pair<Integer, Integer>, Integer> e : stateToRow.entrySet()) {
      final int row = e.getValue();
      final Pair<Integer, Integer> state = e.getKey();
      final int p1 = state.left();
      final int p2 = state.right();
      if (p1 - 1 > 0 && p2 - 1 > 0) {
        // Each player throws away a coin
        final int code = stateToRow.get(new Pair<>(p1 - 1, p2 - 1));
        q.set(row, code, q.get(row, code).subtract(Q.ONE_THIRD));
      }
      if (p1 - 1 > 0) {
        // Player 1 gives a coin to 2 (note 1 already has fewer coins than 2)
        final int code = stateToRow.get(new Pair<>(p1 - 1, p2 + 1));
        q.set(row, code, q.get(row, code).subtract(Q.ONE_THIRD));
      }
      if (p2 - 1 > 0) {
        // Player 2 gives a coin to 1 (take care to ensure 1 is smaller)
        final int a1 = Math.min(p1 + 1, p2 - 1);
        final int b1 = Math.max(p1 + 1, p2 - 1);
        final int code = stateToRow.get(new Pair<>(a1, b1));
        q.set(row, code, q.get(row, code).subtract(Q.ONE_THIRD));
      }
    }
    // Add I
    for (int k = 0; k < q.rows(); ++k) {
      q.set(k, k, q.get(k, k).add(Q.ONE));
    }
    //System.out.println("q=" + q);
    final Matrix<Q> inverse = new MatrixField<>(states, Rationals.SINGLETON).inverse(q);
    // Take account of initial distribution of states
    final int maxCol = (int) (inverse.cols() - 1);
    Q sum = Q.ZERO;
    for (int p1 = 1; 2 * p1 <= mN; ++p1) {
      final int row = p1 - 1;
      final Q rowSum = Rationals.SINGLETON.sum(0, maxCol, k -> inverse.get(row, k));
      sum = sum.add(rowSum.multiply(Binomial.binomial(mN, p1).multiply(2 * p1 == mN ? 1 : 2)));
    }
    return select(sum.divide(Z.ONE.shiftLeft(mN)));
  }
}
