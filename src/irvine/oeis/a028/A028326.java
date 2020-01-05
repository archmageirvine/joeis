package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.oeis.a007.A007318;

/**
 * A028326 Twice Pascal's triangle <code>A007318: T(n,k) = 2*C(n,k)</code>.
 * @author Sean A. Irvine
 */
public class A028326 extends A007318 {

  @Override
  public Z next() {
    return super.next().multiply2();
  }
}
