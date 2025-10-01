package irvine.oeis.a080;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a078.A078781;

/**
 * A080802 Smaller of the two factors of the n-th semiprime number of the form m!-1.
 * @author Sean A. Irvine
 */
public class A080802 extends A078781 {

  @Override
  public Z next() {
    return Functions.LPF.z(Functions.FACTORIAL.z(super.next()).subtract(1));
  }
}
