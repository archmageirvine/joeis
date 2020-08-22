package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007578 Number of Young tableaux of height &lt;= 7.
 * @author Sean A. Irvine
 */
public class A007578 implements Sequence {

  // After Alois P. Heinz

  private static final Z Z34 = Z.valueOf(34);
  private static final Z Z38 = Z.valueOf(38);

  private Z[] mA = {Z.ONE, Z.ONE, Z.TWO, Z.FOUR};
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN < mA.length) {
      return mA[mN];
    }
    final Z a3 = mA[3].multiply(Z.FOUR.multiply(mN).add(78).multiply(mN).add(424).multiply(mN).add(495));
    final Z a2 = mA[2].multiply(Z34.multiply(mN).add(280).multiply(mN).add(305)).multiply(mN - 1);
    final Z a1 = mA[1].multiply(Z38.multiply(mN).add(145)).multiply(mN - 2).multiply(mN - 1).multiply2();
    final Z a0 = mA[0].multiply(mN - 3).multiply(mN - 2).multiply(mN - 1).multiply(105);
    final Z t = a3.add(a2).subtract(a1).subtract(a0).divide(mN + 6).divide(mN + 10).divide(mN + 12);
    mA[0] = mA[1];
    mA[1] = mA[2];
    mA[2] = mA[3];
    mA[3] = t;
    return t;
  }
}
