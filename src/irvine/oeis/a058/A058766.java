package irvine.oeis.a058;

import irvine.math.z.Z;
import irvine.oeis.a001.A001037;

/**
 * A058766 a(0) = 1, a(1) = 2; for n&gt;=2 a(n) is the number of degree-n reducible polynomials over GF(2).
 * @author Sean A. Irvine
 */
public class A058766 extends A001037 {

  @Override
  public Z next() {
    final Z t = super.next();
    if (mN <= 1) {
      return mN == 0 ? Z.ONE : Z.TWO;
    }
    return Z.ONE.shiftLeft(mN).subtract(t);
  }
}
