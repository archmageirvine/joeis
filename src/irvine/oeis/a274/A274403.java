package irvine.oeis.a274;

import irvine.math.z.Z;
import irvine.oeis.a006.A006991;

/**
 * A274403 Number of primitive (squarefree) congruent numbers (A006991) &lt;= 10^n.
 * @author Sean A. Irvine
 */
public class A274403 extends A006991 {

  private Z mT = Z.ONE;
  private Z mA = super.next();
  private long mCount = 0;

  @Override
  public Z next() {
    mT = mT.multiply(10);
    while (mA.compareTo(mT) <= 0) {
      ++mCount;
      mA = super.next();
    }
    return Z.valueOf(mCount);
  }
}
