package irvine.oeis.a387;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a005.A005117;

/**
 * A387980 Sum of squarefree numbers &lt;= 10^n.
 * @author Sean A. Irvine
 */
public class A387980 extends Sequence0 {

  private Z mLim = null;
  private final Sequence mS = new A005117();
  private Z mA = mS.next();
  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    mLim = mLim == null ? Z.ONE : mLim.multiply(10);
    while (mA.compareTo(mLim) <= 0) {
      mSum = mSum.add(mA);
      mA = mS.next();
    }
    return mSum;
  }
}

