package irvine.oeis.a037;

import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A037184 Functional digraphs with 1 node not in the image.
 * @author Sean A. Irvine
 */
public class A037184 extends Sequence3 {

  private long mN = 2;
  private Z mA = Z.SIX;
  private Z mB = Z.valueOf(48);

  @Override
  public Z next() {
    if (++mN == 3) {
      return mA;
    } else if (mN > 4) {
      final Z t = mB.multiply(mN - 2).add(mA.multiply(mN - 1)).multiply(mN).divide(mN - 3);
      mA = mB;
      mB = t;
    }
    return mB;
  }
}
