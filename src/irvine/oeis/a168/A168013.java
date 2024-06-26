package irvine.oeis.a168;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A168013 a(n) = Sum of all divisors of all numbers &lt; (n+1)^2.
 * @author Sean A. Irvine
 */
public class A168013 extends Sequence1 {

  private long mN = 1;
  private long mNext = 1;
  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    ++mN;
    final long limit = mN * mN;
    while (mNext < limit) {
      mSum = mSum.add(Functions.SIGMA1.z(mNext++));
    }
    return mSum;
  }
}

