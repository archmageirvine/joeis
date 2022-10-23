package irvine.oeis.a046;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A046913 Sum of divisors of n not congruent to 0 mod 3.
 * @author Sean A. Irvine
 */
public class A046913 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Jaguar.factor(3 * ++mN).sigma().subtract(Jaguar.factor(mN).sigma().multiply(3));
  }
}
