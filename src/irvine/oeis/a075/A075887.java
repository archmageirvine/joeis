package irvine.oeis.a075;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A075887 a(n) = 1 + n + n[n/2] + n[n/2][n/3] +... + n[n/2][n/3]...[n/n], where [x]=ceiling(x).
 * @author Sean A. Irvine
 */
public class A075887 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ONE;
    Z v = Z.ONE;
    for (long k = 1; k <= mN; ++k) {
      v = v.multiply((mN + k - 1) / k);
      sum = sum.add(v);
    }
    return sum;
  }
}
