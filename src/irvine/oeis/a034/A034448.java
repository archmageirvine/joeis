package irvine.oeis.a034;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A034448 usigma(n) = sum of unitary divisors of n (divisors d such that gcd(d, n/d)=1); also called UnitarySigma(n).
 * @author Sean A. Irvine
 */
public class A034448 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return Jaguar.factor(++mN).unitarySigma();
  }
}
