package irvine.oeis.a061;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;
import irvine.oeis.FiniteSequence;
import irvine.util.Pair;

/**
 * A061310 Numbers which cannot be reached in the Countdown Numbers Game starting from (1,2,3,4,5,6): the game allows brackets and the operations + - x and / and not all numbers need be used, while the result of each partial calculation must be an integer.
 * @author Sean A. Irvine
 */
public class A061310 extends ComplementSequence {

  private static final int MAX = 6;

  private static final class State extends Pair<Byte, Z> {
    private State(final Byte left, final Z right) {
      super(left, right);
    }
  }

  private static Set<Z> build() {
    final TreeSet<Z> seen = new TreeSet<>();
    final List<Set<State>> states = new ArrayList<>();
    final HashSet<State> t = new HashSet<>();
    for (int k = 1; k <= MAX; ++k) {
      final Z z = Z.valueOf(k);
      t.add(new State((byte) (1 << (k - 1)), z));
      seen.add(z);
    }
    states.add(t);
    for (int k = 2; k <= MAX; ++k) {
      final HashSet<State> u = new HashSet<>();
      for (int j = 1; j < k; ++j) {
        for (final State a : states.get(j - 1)) {
          final int syna = a.left();
          for (final State b : states.get(k - j - 1)) {
            if ((syna & b.left()) == 0) {
              final byte syn = (byte) (syna | b.left());
              assert Integer.bitCount(syn) == k;
              u.add(new State(syn, a.right().add(b.right())));
              u.add(new State(syn, a.right().multiply(b.right())));
              if (b.right().compareTo(a.right()) < 0) {
                u.add(new State(syn, a.right().subtract(b.right())));
              }
              if (a.right().mod(b.right()).isZero()) {
                u.add(new State(syn, a.right().divide(b.right())));
              }
            }
          }
        }
      }
      states.add(u);
      for (final State a : u) {
        seen.add(a.right());
      }
    }
    //System.out.println("Max: " + seen.last());
    return seen;
  }

  /** Construct the sequence. */
  public A061310() {
    super(new FiniteSequence(build()), Z.ONE);
  }
}
