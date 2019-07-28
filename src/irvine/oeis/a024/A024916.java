package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024916 <code>a(n) = Sum_{k=1..n} k*floor(n/k)</code>; also <code>Sum_{k=1..n} sigma(k)</code> where <code>sigma(n) =</code> sum of divisors of <code>n (A000203)</code>.
 * @author Sean A. Irvine
 */
public class A024916 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 1; k <= mN; ++k) {
      sum = sum.add(Z.valueOf(k).multiply(mN / k));
    }
    return sum;
  }
}
