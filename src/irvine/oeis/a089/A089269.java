package irvine.oeis.a089;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A089269 Squarefree numbers congruent to 1 or 2 mod 4.
 * @author Sean A. Irvine
 */
public class A089269 extends Sequence1 {

  long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final long r = mN & 3;
      if (r == 1 || r == 2) {
        if (LongUtils.isSquareFree(mN)) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}
