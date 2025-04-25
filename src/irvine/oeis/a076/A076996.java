package irvine.oeis.a076;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076996 a(1) = 2, a(n+1) is the largest prime &lt;= n*a(n).
 * @author Sean A. Irvine
 */
public class A076996 extends Sequence1 {

  private long mN = 0;
  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.TWO;
    } else {
      mA = Functions.PREV_PRIME.z(mA.multiply(++mN).add(1));
    }
    return mA;
  }
}

