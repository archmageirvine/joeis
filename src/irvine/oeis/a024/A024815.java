package irvine.oeis.a024;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024815.
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
