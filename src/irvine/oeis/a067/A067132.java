package irvine.oeis.a067;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067132 Number of elements in the largest set of divisors of n which are in geometric progression.
 * @author Sean A. Irvine
 */
public class A067132 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(Jaguar.factor(++mN).maxExponent() + 1);
  }
}
