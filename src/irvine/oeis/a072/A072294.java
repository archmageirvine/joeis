package irvine.oeis.a072;

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072294 Areas of primitive Heronian triangles sorted by longest side, then by middle side and finally shortest side.
 * @author Sean A. Irvine
 */
public class A072294 extends Sequence1 {

  private long mA = 0;
  private long mB = 0;
  private long mC = 0;

  protected Z select(final long a, final long b, final long c) {
    final Q s = new Q(a + b + c, 2);
    return s.multiply(s.subtract(a)).multiply(s.subtract(b)).multiply(s.subtract(c)).toZ().sqrt();
  }

  @Override
  public Z next() {
    while (true) {
      if (++mC > mB) {
        if (++mB > mA) {
          ++mA;
          mB = 1;
        }
        mC = 1;
      }
      final long s2 = mA + mB + mC;
      if ((s2 & 1) == 0 && Functions.GCD.l(mA, mB, mC) == 1) {
        final long s = s2 / 2;
        final Z area2 = Z.valueOf(s).multiply(s - mA).multiply(s - mB).multiply(s - mC);
        if (area2.signum() > 0 && area2.isSquare()) {
          return select(mA, mB, mC);
        }
      }
    }
  }
}
