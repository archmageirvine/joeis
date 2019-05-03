package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005189 Number of <code>n-term 2-sided</code> generalized Fibonacci sequences.
 * @author Sean A. Irvine
 */
public class A005189 implements Sequence {

  private long mN = -1;
  private Z mA = Z.ONE;
  private Z mB = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 2) {
      final Z t = mB.multiply(mN - 1).multiply2().subtract(mA.multiply(mN - 2).multiply(mN - 2));
      mA = mB;
      mB = t;
    }
    return mB;
  }
}

