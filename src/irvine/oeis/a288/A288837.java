package irvine.oeis.a288;

import irvine.math.z.Z;
import irvine.oeis.a000.A000521;

/**
 * A288837 Coefficients in expansion of 691*E_12/Delta where Delta is the generating function of Ramanujan's tau function (A000594).
 * @author Georg Fischer
 */
public class A288837 extends A000521 {

  private int mN = -2;

  @Override
  public Z next() {
    ++mN;
    final Z result = super.next();
    if (mN == 0) {
      return Z.valueOf(82104);
    }
    return result.multiply(691);
  }
}
