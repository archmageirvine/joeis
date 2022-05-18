package irvine.oeis.a013;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013971 a(n) = sum of 23rd powers of divisors of n.
 * @author Sean A. Irvine
 */
public class A013971 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return Jaguar.factor(++mN).sigma(23);
  }
}
