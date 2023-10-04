package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A066195 Smallest prime containing n zeros in its binary expansion.
 * @author Sean A. Irvine
 */
public class A066195 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.THREE;
    }
    if (mN == 1) {
      return Z.TWO;
    }
    // Only first and last bits are 1
    final Z r0 = Z.ONE.shiftLeft(mN + 1).add(1);
    if (r0.isProbablePrime()) {
      return r0;
    }
    // A total of three 1 bits
    final Z r1 = Z.ONE.shiftLeft(mN + 2).add(1);
    for (int k = 1; k <= mN + 1; ++k) {
      final Z t = r1.setBit(k);
      if (t.isProbablePrime()) {
        return t;
      }
    }
    // A total of four 1 bits
    final Z r2 = Z.ONE.shiftLeft(mN + 3).add(1);
    for (int k = 2; k <= mN + 2; ++k) {
      final Z rk = r2.setBit(k);
      for (int j = 1; j < k; ++j) {
        final Z t = rk.setBit(j);
        if (t.isProbablePrime()) {
          return t;
        }
      }
    }
    throw new UnsupportedOperationException();
  }
}
