package irvine.oeis.a074;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074848 Number of 4-infinitary divisors of n.
 * @author Sean A. Irvine
 */
public class A074848 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Functions.INFINITARY_SIGMA0.z(4, ++mN);
  }
}
