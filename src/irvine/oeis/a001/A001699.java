package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A001699 Number of binary trees of height n; or products (ways to insert parentheses) of height n when multiplication is non-commutative and non-associative.
 * @author Sean A. Irvine
 */
public class A001699 extends Sequence0 {

  private Z mA = Z.ONE;
  private Z mB = Z.ZERO;
  private Z mS = Z.ZERO;

  @Override
  public Z next() {
    mA = mS.multiply(mA).multiply2().add(mA.square());
    mS = mS.add(mB);
    mB = mA;
    return mA;
  }
}
