package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007580.
 * @author Sean A. Irvine
 */
public class A007580 implements Sequence {

  // After Alois P. Heinz

  private static final Z Z40 = Z.valueOf(40);

  private Z[] mA = {Z.ONE, Z.ONE, Z.TWO, Z.FOUR};
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN < mA.length) {
      return mA[mN];
    }
    final Z a3 = mA[3].multiply(Z40.multiply(mN).add(1084).multiply(mN).add(8684).multiply(mN).add(18480));
    final Z a2 = mA[2].multiply(Z.FIVE.multiply(mN).add(107).multiply(mN).add(610).multiply(mN).add(600)).multiply(mN - 1).multiply(16);
    final Z a1 = mA[1].multiply(mN + 6).multiply(mN - 2).multiply(mN - 1).multiply(1024);
    final Z a0 = mA[0].multiply(mN + 4).multiply(mN - 3).multiply(mN - 2).multiply(mN - 1).multiply(1024);
    final Z t = a3.add(a2).subtract(a1).subtract(a0).divide(mN + 7).divide(mN + 12).divide(mN + 15).divide(mN + 16);
    mA[0] = mA[1];
    mA[1] = mA[2];
    mA[2] = mA[3];
    mA[3] = t;
    return t;
  }
}
