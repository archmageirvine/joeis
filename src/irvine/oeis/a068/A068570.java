package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.English;

/**
 * A068545.
 * @author Sean A. Irvine
 */
public class A068570 extends Sequence1 {

  private int mN = -1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final int len = English.SINGLETON.toRawText(mN).length();
      if (mN % len == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
