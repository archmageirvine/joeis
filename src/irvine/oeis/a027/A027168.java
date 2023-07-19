package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027168 Greatest number in row n of array T given by A027157.
 * @author Sean A. Irvine
 */
public class A027168 extends A027157 {

  /** Construct the sequence. */
  public A027168() {
    super(0);
  }

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z max = Z.ZERO;
    for (long k = 0; k <= mN; ++k) {
      max = max.max(t(mN, k));
    }
    return max;
  }
}
