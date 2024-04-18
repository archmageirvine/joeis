package irvine.oeis.a366;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a007.A007908;

/**
 * A366955 a(n) is the Euler totient function of the concatenation of 1,2,3,...,n.
 * @author Sean A. Irvine
 */
public class A366955 extends A007908 {

  @Override
  public Z next() {
    return Functions.PHI.z(super.next());
  }
}
