package irvine.oeis.a046;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A046913 Sum of divisors of n not congruent to 0 mod 3.
 * @author Sean A. Irvine
 */
public class A046913 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return Cheetah.factor(3 * ++mN).sigma().subtract(Cheetah.factor(mN).sigma().multiply(3));
  }
}
