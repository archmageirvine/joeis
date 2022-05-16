package irvine.oeis.a000;

import irvine.factor.factor.Jaguar;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000089 Number of solutions to x^2 + 1 == 0 (mod n).
 * @author Sean A. Irvine
 */
public class A000089 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    if ((mN & 3) == 0) {
      return Z.ZERO;
    }
    int s = 1;
    for (final Z t : Jaguar.factor(mN).toZArray()) {
      final long h = t.longValue();
      if (h > 2) {
        s *= 1 + LongUtils.jacobi(-1, h);
      }
    }
    return Z.valueOf(s);
  }
}

