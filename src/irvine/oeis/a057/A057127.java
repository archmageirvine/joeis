package irvine.oeis.a057;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A057127 -2 is a square <code>mod n</code>.
 * @author Sean A. Irvine
 */
public class A057127 implements Sequence {

  private long mN = 0;

  private boolean isA057127(final long n) {
    if ((n & 3) == 0) {
      return false;
    }
    for (final Z p : Cheetah.factor(n).toZArray()) {
      final long r = p.mod(8);
      if (r < 1 || r > 3) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      if (isA057127(++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
