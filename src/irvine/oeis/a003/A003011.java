package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003011.
 * @author Sean A. Irvine
 */
public class A003011 implements Sequence {

  private long mN = -1;
  private Z mA = Z.ONE;
  private Z mB = Z.THREE;
  private Z mC = Z.valueOf(19);

  @Override
  public Z next() {
    if (++mN < 3) {
      if (mN == 0) {
        return Z.ONE;
      }
      if (mN == 1) {
        return Z.THREE;
      }
    } else {
      final Z n = Z.valueOf(mN);
      final Z n2 = n.square();
      final Z n3 = n2.multiply(n);
      final Z t = mC.multiply(n3.multiply2().subtract(n2).add(mN + 1))
        .add(mB.multiply(n3.multiply(-3).add(n2.multiply(4)).add(2 * mN - 3)))
        .add(mA.multiply(n3.subtract(n2.multiply2()).subtract(mN - 2)))
        .divide(mN);
      mA = mB;
      mB = mC;
      mC = t;
    }
    return mC;
  }
}
