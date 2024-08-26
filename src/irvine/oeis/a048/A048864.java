package irvine.oeis.a048;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A048864 Number of nonprime numbers (composites and 1) in the reduced residue system of n.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A048864 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Functions.PHI.z(mN).subtract(Functions.PRIME_PI.l(mN)).add(Functions.OMEGA.l(mN));
  }
}
