package irvine.oeis.a390;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A390608 a(n) = phi(n) * omega(n).
 * @author Sean A. Irvine
 */
public class A390608 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Functions.PHI.z(++mN).multiply(Functions.OMEGA.l(mN));
  }
}
