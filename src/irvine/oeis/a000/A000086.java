package irvine.oeis.a000;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A000086 Number of solutions to x^2 - x + 1 == 0 (mod n).
 * @author Sean A. Irvine
 */
public class A000086 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    if ((mN & 1) == 0 || mN % 9 == 0) {
      return Z.ZERO;
    }
    int s = 1;
    for (final Z t : Jaguar.factor(mN).toZArray()) {
      final long h = t.longValue();
      if (h != 2) {
        s *= 1 + Functions.JACOBI.i(-3, h);
      }
    }
    return Z.valueOf(s);
  }

}

