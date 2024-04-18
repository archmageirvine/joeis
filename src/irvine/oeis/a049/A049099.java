package irvine.oeis.a049;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a010.A010554;

/**
 * A049099 a(n) = Euler phi function applied thrice to n.
 * @author Sean A. Irvine
 */
public class A049099 extends A010554 {

  @Override
  public Z next() {
    return Functions.PHI.z(super.next());
  }
}

