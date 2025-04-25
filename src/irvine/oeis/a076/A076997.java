package irvine.oeis.a076;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076997 a(1) = 1, a(n+1) is the largest square &lt;= n*a(n).
 * @author Sean A. Irvine
 */
public class A076997 extends Sequence1 {

  private long mN = 0;
  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
    } else {
      mA = mA.multiply(++mN).sqrt().square();
    }
    return mA;
  }
}

