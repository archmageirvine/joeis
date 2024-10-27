package irvine.oeis.a072;

import irvine.math.z.Z;

/**
 * A072778 Number of powers of squarefree numbers &lt;= n.
 * @author Sean A. Irvine
 */
public class A072778 extends A072774 {

  private Z mN = Z.ZERO;
  private Z mT = super.next();
  private Z mCount = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    if (mN.equals(mT)) {
      mT = super.next();
      mCount = mCount.add(1);
    }
    return mCount;
  }
}
