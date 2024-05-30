package irvine.oeis.a006;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A006579 a(n) = Sum_{k=1..n-1} gcd(n,k).
 * @author Sean A. Irvine
 */
public class A006579 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 1; k < mN; ++k) {
      sum = sum.add(Functions.GCD.l(mN, k));
    }
    return sum;
  }
}
