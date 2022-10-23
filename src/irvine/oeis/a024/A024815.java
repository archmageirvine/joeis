package irvine.oeis.a024;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A024815 a(n) = least k such that tan(k) &lt; tan(a(n-1)), for n &gt;= 1, with a(0) = 0.
 * @author Sean A. Irvine
 */
public class A024815 extends Sequence0 {

  private long mN = -1;
  private CR mTan = CR.ONE;

  @Override
  public Z next() {
    while (true) {
      final CR tan = ComputableReals.SINGLETON.tan(CR.valueOf(++mN));
      if (tan.compareTo(mTan) < 0) {
        mTan = tan;
        return Z.valueOf(mN);
      }
    }
  }
}
