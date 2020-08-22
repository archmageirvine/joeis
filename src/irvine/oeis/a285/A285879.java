package irvine.oeis.a285;

import irvine.math.z.Z;
import irvine.oeis.a008.A008683;

/**
 * A285879 Number of odd squarefree numbers &lt;= n.
 * @author Sean A. Irvine
 */
public class A285879 extends A008683 {

  private Z mSum = Z.ZERO;
  private boolean mEven = false;

  @Override
  public Z next() {
    mEven = !mEven;
    final Z mobius = super.next();
    if (mEven && !Z.ZERO.equals(mobius)) {
      mSum = mSum.add(1);
    }
    return mSum;
  }
}

