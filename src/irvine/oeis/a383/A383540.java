package irvine.oeis.a383;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A383540 Positive numbers k such that (sin k)^k sets a new record.
 * @author Sean A. Irvine
 */
public class A383540 extends Sequence1 {

  private CR mMax = CR.ZERO;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final CR s = CR.valueOf(++mN).sin().pow(mN);
      if (s.compareTo(mMax) > 0) {
        mMax = s;
        return Z.valueOf(mN);
      }
    }
  }
}

