package irvine.oeis.a020;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A020896 Positive numbers n such that <code>n = x^5 + y^5</code> has a solution in nonzero integers x, <code>y</code>.
 * @author Sean A. Irvine
 */
public class A020896 implements Sequence {

  private Z mN = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z lim = mN.multiply(20).add(5).multiply(100).sqrt().subtract(25).sqrt().add(5).divide(10);
      for (Z k = Z.ONE; k.compareTo(lim) <= 0; k = k.add(1)) {
        final Z r = mN.subtract(k.pow(5));
        if (!Z.ZERO.equals(r)) {
          r.root(5);
          if (r.auxiliary() == 1) {
            return mN;
          }
        }
      }
    }
  }
}
