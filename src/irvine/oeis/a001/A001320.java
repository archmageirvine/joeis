package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001320 Number of self-complementary Boolean functions of n variables: see Comments for precise definition.
 * @author Sean A. Irvine
 */
public class A001320 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Z.ONE.shiftLeft((1 << (mN - 1)) - mN).multiply((1L << mN) - 1);
  }
}
