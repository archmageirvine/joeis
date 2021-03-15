package irvine.oeis.a045;

import java.util.TreeSet;

import irvine.math.LongUtils;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A045610 Number of different energy states of n positive and n negative charges on a string.
 * @author Sean A. Irvine
 */
public class A045610 implements Sequence {

  // todo pending explanation from Wouter

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN < 2) {
      return Z.ONE;
    }
    final TreeSet<Q> energy = new TreeSet<>();
    final int charges = 2 * mN;
    final long limit = 1L << charges;
    for (long state = (1L << mN) - 1; state < limit; state = LongUtils.swizzle(state)) {
      Q sum = Q.ZERO;
      for (int k = 0; k < charges; ++k) {
        Q s = Q.ZERO;
        for (int j = 0; j < charges; ++j) {
          if (k != j) {
            s = s.signedAdd((state & (1L << j)) == 0, new Q(1, Math.abs(k - j)));
          }
        }
        sum = sum.signedAdd((state & (1L << k)) == 0, s);
      }
//      final String s = "00000000000000000000" + Long.toBinaryString(state);
//      System.out.println("state=" + s.substring(s.length() - charges) + " U=" + sum);
      energy.add(sum);
    }
    return Z.valueOf(energy.size());
  }
}
