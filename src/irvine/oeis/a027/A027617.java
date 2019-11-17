package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A027617 Number of permutations of n elements containing a <code>3-cycle</code>.
 * @author Sean A. Irvine
 */
public class A027617 implements Sequence {

  private long mN = -1;
  private Z mA = Z.ZERO;
  private Z mB = Z.ZERO;
  private Z mC = Z.ZERO;
  private Z mD = Z.TWO;


  @Override
  public Z next() {
    if (++mN < 3) {
      return Z.ZERO;
    } else if (mN > 3) {
      final Z t = mD.multiply(mN)
        .subtract(mB.multiply(mN - 1).multiply(mN - 2))
        .add(mA.multiply(mN - 1).multiply(mN - 2).multiply(mN - 3));
      mA = mB;
      mB = mC;
      mC = mD;
      mD = t;
    }
    return mD;
  }
}
