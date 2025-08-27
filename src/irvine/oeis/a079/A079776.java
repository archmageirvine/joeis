package irvine.oeis.a079;

import irvine.math.z.Integers;
import irvine.math.z.Z;

/**
 * A079776 a(n) = sum of n-th row of the triangle pertaining to A079774(n).
 * @author Sean A. Irvine
 */
public class A079776 extends A079775 {

  private int mN = 0;

  @Override
  public Z next() {
    return Integers.SINGLETON.sum(1, ++mN, k -> super.next());
  }
}

