package irvine.oeis.a238;

import irvine.math.z.Z;
import irvine.oeis.a269.A269920;

/**
 * A238358 Number of genus-8 rooted maps with n edges.
 * @author Sean A. Irvine
 */
public class A238358 extends A269920 {

  /** Construct the sequence. */
  public A238358() {
    super(16);
  }

  private int mN = 15;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 0; k <= mN + 1; ++k) {
      sum = sum.add(get(mN, 8, k));
    }
    return sum;
  }
}
