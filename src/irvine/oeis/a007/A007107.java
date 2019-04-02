package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007107 Number of labeled 2-regular digraphs with n nodes.
 * @author Sean A. Irvine
 */
public class A007107 implements Sequence {

  private long mN = -1;
  private Z mA = null;
  private Z mB = null;
  private Z mC = null;
  private Z mD = null;
  private Z mE = null;

  @Override
  public Z next() {
    final Z t;
    if (++mN < 5) {
      t = Z.valueOf(mN - 1).multiply(mN - 2).divide2().square();
    } else {
      final Z n = Z.valueOf(mN);
      final Z t1 = mE.multiply(n.subtract(2).multiply(mN).add(1).multiply(mN).add(1)).multiply2().divide(mN - 2);
      final Z t2 = mD.multiply(mN + 1).multiply(n.subtract(2).multiply(mN).add(2));
      final Z t3 = mC.multiply(mN).multiply(n.multiply2().subtract(6).multiply(mN).add(1));
      final Z t4 = mB.multiply(n.subtract(5).multiply(mN).multiply(mN).add(3));
      final Z t5 = mA.multiply(mN + 1).multiply(mN - 1).multiply(mN - 4);
      t = t1
        .add(t2)
        .add(t3)
        .add(t4.subtract(t5).multiply(mN - 3))
        .multiply(mN - 1)
        .divide(2 * mN);
    }
    mA = mB;
    mB = mC;
    mC = mD;
    mD = mE;
    mE = t;
    return t;
  }
}
