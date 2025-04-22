package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A001320 Number of self-complementary Boolean functions of n variables, up to equivalence under the group (C_2)^n of all 2^n complementations of variables.
 * @author Sean A. Irvine
 */
public class A001320 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Z.ONE.shiftLeft((1L << (mN - 1)) - mN).multiply((1L << mN) - 1);
  }
}
