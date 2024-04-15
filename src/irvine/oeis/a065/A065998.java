package irvine.oeis.a065;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A065998 Concatenate n and number of divisors of n.
 * @author Sean A. Irvine
 */
public class A065998 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return new Z(String.valueOf(++mN) + Functions.SIGMA0.z(mN));
  }
}
