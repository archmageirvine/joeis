package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.oeis.a005.A005329;

/**
 * A028368 a(n) = (Product_{j=1..n-1} (2^j-1)) * 2^binomial(n+1,2).
 * @author Sean A. Irvine
 */
public class A028368 extends A005329 {

  private int mN = -1;

  @Override
  public Z next() {
    return ++mN == 0 ? Z.ONE : super.next().shiftLeft(mN * (mN + 1) / 2);
  }
}
