package irvine.oeis.a075;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a007.A007908;

/**
 * A075019 a(1) = 1; for n &gt; 1, a(n) = the smallest prime divisor of the number C(n) formed from the concatenation of 1,2,3,... up to n.
 * @author Sean A. Irvine
 */
public class A075019 extends A007908 {

  @Override
  public Z next() {
    return Functions.LPF.z(super.next());
  }
}
