package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014816 <code>a(n) = Sum_{k=1..n} ceiling(k^4/n)</code>.
 * @author Sean A. Irvine
 */
public class A014816 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 1; k <= mN; ++k) {
      sum = sum.add(Z.valueOf(k).pow(4).add(mN - 1).divide(mN));
    }
    return sum;
  }
}
