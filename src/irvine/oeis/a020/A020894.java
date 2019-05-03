package irvine.oeis.a020;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A020894 Nonnegative numbers that are sums of two nonzero cubes.
 * @author Sean A. Irvine
 */
public class A020894 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Z.ZERO.equals(mN)) {
        return Z.ZERO;
      }
      final Z lim = mN.multiply(12).subtract(3).sqrt().add(3).divide(6);
      for (Z k = Z.ONE; k.compareTo(lim) <= 0; k = k.add(1)) {
        final Z r = mN.subtract(k.pow(3));
        if (!Z.ZERO.equals(r)) {
          r.root(3);
          if (r.auxiliary() == 1) {
            return mN;
          }
        }
      }
    }
  }
}
