package irvine.oeis.a036;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A036779 Greedy sequence such that no term is the average of three others.
 * @author Sean A. Irvine
 */
public class A036779 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    outer:
    while (true) {
      if (++mN > 4) {
        long m = mN >>> 2;
        boolean nonzero = (mN & 3) != 0;
        while (m != 0) {
          final long r = m & 3;
          if (r == 2 || (r == 1 && nonzero)) {
            continue outer;
          }
          nonzero |= r != 0;
          m >>>= 2;
        }
      }
      return Z.valueOf(mN);
    }
  }
}
