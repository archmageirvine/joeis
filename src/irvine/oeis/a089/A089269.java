package irvine.oeis.a089;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A089269 Squarefree numbers congruent to 1 or <code>2 mod 4</code>.
 * @author Sean A. Irvine
 */
public class A089269 implements Sequence {

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
