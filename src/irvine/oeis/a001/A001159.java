package irvine.oeis.a001;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001159 sigma_4(n): sum of 4th powers of divisors of n.
 * @author Sean A. Irvine
 */
public class A001159 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return Cheetah.factor(++mN).sigma(4);
  }
}
