package irvine.oeis.a045;

import irvine.math.partitions.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A045900 Hypothetical numbers of terms in general expressions for coefficients of Lovelock Lagrangians.
 * @author Sean A. Irvine
 */
public class A045900 extends Sequence0 {

  private static final Z[] SMALL = {Z.ONE, Z.ONE, Z.THREE, Z.EIGHT};
  private int mN = -1;
  private Z mA = Z.ONE;
  private Z mB = Z.THREE;
  private Z mC = Z.EIGHT;

  @Override
  public Z next() {
    if (++mN <= 3) {
      return SMALL[mN];
    }
    final Z t = mA
      .subtract(mB.multiply(3))
      .add(mC.multiply(3))
      .subtract(IntegerPartition.partitions(mN - 3))
      .add(IntegerPartition.partitions(mN - 2).multiply(3))
      .subtract(IntegerPartition.partitions(mN - 1).multiply(3))
      .add(IntegerPartition.partitions(mN))
      .add(Z.ONE.shiftLeft(2L * (mN - 3) + 1));
    mA = mB;
    mB = mC;
    mC = t;
    return t;
  }
}
