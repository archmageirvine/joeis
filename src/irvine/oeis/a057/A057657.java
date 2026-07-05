package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.a085.A085685;

/**
 * A057657 Maximal size of binary code of length n that corrects one transposition (end-around transposition included).
 * @author Sean A. Irvine
 */
public class A057657 extends A085685 {

  private int mN = 0;

  /** Construct the sequence. */
  public A057657() {
    super(1);
  }

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
