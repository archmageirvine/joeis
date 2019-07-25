package irvine.oeis.a024;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024815 <code>a(n) =</code> least k such that <code>tan(k) &lt; tan(a(n-1))</code>, for <code>n &gt;= 1</code>, with <code>a(0) = 0</code>.
 * @author Sean A. Irvine
 */
public class A024815 implements Sequence {

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
