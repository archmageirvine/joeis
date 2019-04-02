package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.a274.A274447;

/**
 * A001662 Coefficients of Airey's converging factor.
 * @author Sean A. Irvine
 */
public class A001662 extends A274447 {

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ZERO;
    }
    Z s = Z.ZERO;
    for (int k = 0; k < mN; ++k) {
      final Z t = get(mN - 1, k);
      s = s.signedAdd((k & 1) == 0, t);
    }
    return s;
  }
}
