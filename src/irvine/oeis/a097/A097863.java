package irvine.oeis.a097;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A097863 Sum of 5-infinitary divisors of n.
 * @author Sean A. Irvine
 */
public class A097863 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Functions.INFINITARY_SIGMA1.z(5, ++mN);
  }
}
