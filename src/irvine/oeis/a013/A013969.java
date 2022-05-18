package irvine.oeis.a013;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013969 a(n) = sigma_21(n), the sum of the 21st powers of the divisors of n.
 * @author Sean A. Irvine
 */
public class A013969 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return Jaguar.factor(++mN).sigma(21);
  }
}
