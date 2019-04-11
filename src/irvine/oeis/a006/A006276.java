package irvine.oeis.a006;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006276 Pierce expansion of <code>(3 - sqrt(5))/2</code>.
 * @author Sean A. Irvine
 */
public class A006276 implements Sequence {

  private static final CR C = CR.FIVE.sqrt();
  private static final CR A = CR.THREE.add(C).multiply(CR.HALF);
  private static final CR B = CR.THREE.subtract(C).multiply(CR.HALF);
  private int mN = 0;
  private int mT = 1;

  @Override
  public Z next() {
    ++mN;
    if ((mN & 1) == 0) {
      return ComputableReals.SINGLETON.pow(A, mT).add(ComputableReals.SINGLETON.pow(B, mT)).toZ().add(1);
    } else {
      if (mN > 2) {
        mT *= 3;
      }
      return ComputableReals.SINGLETON.pow(A, mT).add(ComputableReals.SINGLETON.pow(B, mT)).toZ().subtract(1);
    }
  }
}
