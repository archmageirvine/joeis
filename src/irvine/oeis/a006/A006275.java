package irvine.oeis.a006;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006275 Pierce expansion of sqrt(2) - 1.
 * @author Sean A. Irvine
 */
public class A006275 implements Sequence {

  private static final CR C = CR.SQRT2.multiply(CR.TWO);
  private static final CR A = CR.THREE.add(C);
  private static final CR B = CR.THREE.subtract(C);
  private int mN = -1;
  private int mT = 1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.TWO;
    } else if ((mN & 1) == 0) {
      return ComputableReals.SINGLETON.pow(A, mT).add(ComputableReals.SINGLETON.pow(B, mT)).toZ().add(1);
    } else {
      if (mN > 2) {
        mT *= 3;
      }
      return ComputableReals.SINGLETON.pow(A, mT).add(ComputableReals.SINGLETON.pow(B, mT)).toZ().subtract(1);
    }
  }
}
