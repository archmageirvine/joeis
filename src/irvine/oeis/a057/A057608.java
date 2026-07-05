package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.a085.A085684;

/**
 * A057608 Maximal size of binary code of length n that corrects one transposition (end-around transposition not included).
 * @author Sean A. Irvine
 */
public class A057608 extends A085684 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 0; k <= mN; ++k) {
      sum = sum.add(t(mN, k));
    }
    return sum;
  }
}
