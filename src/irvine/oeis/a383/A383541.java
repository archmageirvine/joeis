package irvine.oeis.a383;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A383541 Numbers k such that (cos k)^k sets a new record.
 * @author Sean A. Irvine
 */
public class A383541 extends Sequence1 {

  private CR mMax = CR.ZERO;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final CR c = CR.valueOf(++mN).cos().pow(mN);
      if (c.compareTo(mMax) > 0) {
        mMax = c;
        return Z.valueOf(mN);
      }
    }
  }
}

