package irvine.oeis.a034;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A034460 a(n) = usigma(n) - n, where usigma(n) = sum of unitary divisors of n (A034448).
 * @author Sean A. Irvine
 */
public class A034460 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Jaguar.factor(++mN).unitarySigma().subtract(mN);
  }
}
