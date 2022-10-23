package irvine.oeis.a011;

import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A011975 Covering numbers C(n,3,2).
 * @author Sean A. Irvine
 */
public class A011975 extends Sequence3 {

  private long mN = 2;

  @Override
  public Z next() {
    ++mN;
    Z a = Z.ONE;
    for (long k = mN - 1; k <= mN; ++k) {
      a = a.multiply(k).add(k - mN + 2).divide(k - mN + 3);
    }
    return a;
  }
}
