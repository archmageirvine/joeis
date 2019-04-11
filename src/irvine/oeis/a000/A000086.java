package irvine.oeis.a000;

import irvine.factor.factor.Cheetah;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000086 Number of solutions to <code>x^2 - x + 1 == 0 (mod n)</code>.
 * @author Sean A. Irvine
 */
public class A000086 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    if ((mN & 1) == 0 || mN % 9 == 0) {
      return Z.ZERO;
    }
    int s = 1;
    for (final Z t : Cheetah.factor(mN).toZArray()) {
      final long h = t.longValue();
      if (h != 2) {
        s *= 1 + LongUtils.jacobi(-3, h);
      }
    }
    return Z.valueOf(s);
  }

}

