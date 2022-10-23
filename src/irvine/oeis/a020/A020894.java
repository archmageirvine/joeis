package irvine.oeis.a020;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A020894 Nonnegative numbers that are sums of two nonzero cubes.
 * @author Sean A. Irvine
 */
public class A020894 extends Sequence1 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (mN.isZero()) {
        return Z.ZERO;
      }
      final Z lim = mN.multiply(12).subtract(3).sqrt().add(3).divide(6);
      for (Z k = Z.ONE; k.compareTo(lim) <= 0; k = k.add(1)) {
        final Z r = mN.subtract(k.pow(3));
        if (!r.isZero()) {
          r.root(3);
          if (r.auxiliary() == 1) {
            return mN;
          }
        }
      }
    }
  }
}
