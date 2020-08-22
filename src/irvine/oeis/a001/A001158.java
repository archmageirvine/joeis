package irvine.oeis.a001;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001158 sigma_3(n): sum of cubes of divisors of n.
 * @author Sean A. Irvine
 */
public class A001158 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return Cheetah.factor(++mN).sigma(3);
  }
}
