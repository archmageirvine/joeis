package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002720 Number of partial permutations of <code>an</code> n-set; number of n X n binary matrices with at most one 1 in each row and column.
 * @author Sean A. Irvine
 */
public class A002720 implements Sequence {

  private Z mA = Z.ONE;
  private Z mB = Z.TWO;
  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    if (Z.ZERO.equals(mN)) {
      return Z.ONE;
    } else if (!Z.ONE.equals(mN)) {
      final Z t = mB.multiply(mN).multiply2().subtract(mN.subtract(1).square().multiply(mA));
      mA = mB;
      mB = t;
    }
    return mB;
  }
}
