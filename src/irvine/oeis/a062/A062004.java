package irvine.oeis.a062;

import irvine.math.z.Z;
import irvine.oeis.a055.A055615;

/**
 * A062004 a(n) = 2*n*mu(n).
 * @author Sean A. Irvine
 */
public class A062004 extends A055615 {

  @Override
  public Z next() {
    return super.next().multiply2();
  }
}
