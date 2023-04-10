package irvine.oeis.a062;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A062835 a(1) = 0; for n &gt; 1 a(n) = sum of divisors of n^2-1; or sigma(A005563(n-1)).
 * @author Sean A. Irvine
 */
public class A062835 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return ++mN == 1 ? Z.ZERO : Jaguar.factor(mN * mN - 1).sigma();
  }
}
