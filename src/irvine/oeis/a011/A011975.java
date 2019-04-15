package irvine.oeis.a011;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A011975 Covering numbers <code>C(n,3,2)</code>.
 * @author Sean A. Irvine
 */
public class A011975 implements Sequence {

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
