package irvine.oeis.a043;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A043299 Numerator of L(n) = (Sum_{k=1..n} k^n)/(Sum_{k=1..n-1} k^n).
 * @author Sean A. Irvine
 */
public class A043299 extends Sequence2 {

  private long mN = 1;

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 1; k < mN; ++k) {
      sum = sum.add(Z.valueOf(k).pow(mN));
    }
    return select(new Q(sum.add(Z.valueOf(mN).pow(mN)), sum));
  }
}

