package irvine.oeis.a366;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a007.A007908;

/**
 * A110756 a(n) = tau(N), where N = concatenation 1,2,3,...,n.
 * @author Sean A. Irvine
 */
public class A366954 extends A007908 {

  @Override
  public Z next() {
    return Jaguar.factor(super.next()).sigma();
  }
}
