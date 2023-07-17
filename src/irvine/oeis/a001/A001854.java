package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.a034.A034855;

/**
 * A001854 Total height of all rooted trees on n labeled nodes.
 * @author Sean A. Irvine
 */
public class A001854 extends A034855 {

  /** Construct the sequence. */
  public A001854() {
    super(1);
  }

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z s = Z.ZERO;
    for (int k = 1; k < mN; ++k) {
      s = s.add(r(mN, k).multiply(k));
    }
    return s;
  }
}
