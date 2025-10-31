package irvine.oeis.a081;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A081464 Numbers k such that the fractional part of (3/2)^k decreases monotonically to zero.
 * @author Sean A. Irvine
 */
public class A081464 extends Sequence1 {

  private static final CR C = CR.valueOf(new Q(3, 2));
  private CR mA = CR.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final CR f = C.pow(++mN).frac();
      if (f.compareTo(mA) < 0) {
        mA = f;
        return Z.valueOf(mN);
      }
    }
  }
}
