package irvine.oeis.a034;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A034460 a(n) = usigma(n) - n, where usigma(n) = sum of unitary divisors of n (A034448).
 * @author Sean A. Irvine
 */
public class A034460 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return Jaguar.factor(++mN).unitarySigma().subtract(mN);
  }
}
