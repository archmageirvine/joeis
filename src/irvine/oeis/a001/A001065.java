package irvine.oeis.a001;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001065 Sum of proper divisors (or aliquot parts) of n: sum of divisors of n that are less than <code>n</code>.
 * @author Sean A. Irvine
 */
public class A001065 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return Cheetah.factor(++mN).sigma().subtract(mN);
  }
}
