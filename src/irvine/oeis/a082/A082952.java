package irvine.oeis.a082;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a078.A078778;

/**
 * A082952 Smaller of the two factors of the n-th semiprime number of the form m!+1.
 * @author Sean A. Irvine
 */
public class A082952 extends A078778 {

  @Override
  public Z next() {
    return Functions.LPF.z(Functions.FACTORIAL.z(super.next()).add(1));
  }
}
