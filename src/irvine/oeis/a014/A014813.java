package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014813 a(n) = Sum_{k=0..n} ceiling(k^3/n).
 * @author Sean A. Irvine
 */
public class A014813 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 1; k <= mN; ++k) {
      sum = sum.add(Z.valueOf(k).pow(3).add(mN - 1).divide(mN));
    }
    return sum;
  }
}
