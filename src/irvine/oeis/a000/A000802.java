package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000802 Maximal number of states in deterministic finite automaton accepting a language consisting of some words of length <code>n</code>.
 * @author Sean A. Irvine
 */
public class A000802 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    ++mN;
    for (int k = 0; k <= mN; ++k) {
      final int t = mN - k;
      if (t > 30) { // should be plenty big enough for now
        sum = sum.add(Z.ONE.shiftLeft(k));
      } else {
        final int x = 1 << t;
        if (x > k) {
          sum = sum.add(Z.ONE.shiftLeft(k));
        } else {
          final Z a = Z.ONE.shiftLeft(k);
          final Z b = Z.ONE.shiftLeft(x).subtract(1);
          sum = sum.add(a.compareTo(b) <= 0 ? a : b);
        }
      }
    }
    return sum;
  }
}

