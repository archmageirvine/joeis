package irvine.oeis.a081;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A081700 k-tuple abundance records.
 * @author Sean A. Irvine
 */
public class A081700 extends Sequence1 {

  private long mA = 0;
  private long mN = 11;

  @Override
  public Z next() {
    while (true) {
      final long cnt = A081699.count(Z.valueOf(++mN));
      if (cnt > mA) {
        mA = cnt;
        return Z.valueOf(mA);
      }
    }
  }
}
