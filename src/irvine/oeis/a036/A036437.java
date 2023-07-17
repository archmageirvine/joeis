package irvine.oeis.a036;

import irvine.math.z.Z;

/**
 * A036437 Triangle of coefficients of generating function of ternary rooted trees of height exactly n.
 * @author Sean A. Irvine
 */
public class A036437 extends A036370 {

  /** Construct the sequence. */
  public A036437() {
    super(1);
  }

  private int mM = 0;
  private int mN = 0;

  @Override
  public Z next() {
    if (++mM >= max(mN)) {
      ++mN;
      mM = mN;
    }
    return get(mN, mM).subtract(get(mN - 1, mM));
  }
}
