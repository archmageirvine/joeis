package irvine.oeis.a013;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013961 a(n) = sigma_13(n), the sum of the 13th powers of the divisors of n.
 * @author Sean A. Irvine
 */
public class A013961 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return Jaguar.factor(++mN).sigma(13);
  }
}
