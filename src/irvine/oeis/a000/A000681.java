package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000681 Number of n X n matrices with nonnegative entries and every row and column sum 2.
 * @author Sean A. Irvine
 */
public class A000681 implements Sequence {

  private long mN = -1;
  private Z mA = Z.ONE;
  private Z mB = Z.ONE;

  @Override
  public Z next() {
    final long v = mN;
    if (++mN > 1) {
      final Z t = mB.multiply(mN * mN).subtract(mA.multiply(mN * v / 2).multiply(v));
      mA = mB;
      mB = t;
    }
    return mB;
  }
}
