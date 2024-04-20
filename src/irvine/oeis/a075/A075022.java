package irvine.oeis.a075;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a007.A007908;

/**
 * A075022 a(1) = 1; for n&gt;1, a(n) = the largest prime divisor of the number C(n) formed from the concatenation of 1,2,3,... up to n.
 * @author Sean A. Irvine
 */
public class A075022 extends A007908 {

  @Override
  public Z next() {
    return Functions.GPF.z(super.next());
  }
}
