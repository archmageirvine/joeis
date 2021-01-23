package irvine.oeis.a034;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A034806 Number of distinct sets of 2 numbers &gt; 1 such that their product is between n^2 and (n+1)^2.
 * @author Sean A. Irvine
 */
public class A034806 implements Sequence {

  private long mN = 1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 2; k <= mN; ++k) {
      sum = sum.add((2 * mN + ((mN * mN) % k)) / k);
    }
    return sum;
  }
}

