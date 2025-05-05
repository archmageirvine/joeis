package irvine.oeis.a382;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A077046.
 * @author Sean A. Irvine
 */
public class A382815 extends Sequence1 {

  private CR mMax = CR.ZERO;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final CR s = CR.valueOf(++mN).sin().abs().pow(mN);
      if (s.compareTo(mMax) > 0) {
        mMax = s;
        return Z.valueOf(mN);
      }
    }
  }
}

