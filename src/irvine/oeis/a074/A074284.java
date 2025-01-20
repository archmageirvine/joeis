package irvine.oeis.a074;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074284 Sum of the aliquot divisors of n-th triangular number.
 * @author Sean A. Irvine
 */
public class A074284 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Functions.ALIQUOT.z(Functions.TRIANGULAR.z(++mN));
  }
}
