package irvine.oeis.a075;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000422;

/**
 * A075020 a(1) = 1; for n&gt;1, a(n) = the smallest prime divisor of the number C(n) formed from the reverse concatenation of 1,2,3,... up to n.
 * @author Sean A. Irvine
 */
public class A075020 extends A000422 {

  @Override
  public Z next() {
    return Functions.LPF.z(super.next());
  }
}
