package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.oeis.a007.A007318;

/**
 * A028326 Twice Pascal's triangle A007318: T(n,k) = 2*C(n,k).
 * @author Sean A. Irvine
 */
public class A028326 extends A007318 {

  @Override
  public Z next() {
    return super.next().multiply2();
  }
}
