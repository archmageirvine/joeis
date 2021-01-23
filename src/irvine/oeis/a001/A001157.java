package irvine.oeis.a001;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001157 sigma_2(n): sum of squares of divisors of n.
 * @author Sean A. Irvine
 */
public class A001157 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return Cheetah.factor(++mN).sigma(2);
  }
}
