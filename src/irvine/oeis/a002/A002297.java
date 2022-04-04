package irvine.oeis.a002;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002297 Numerator of (2/Pi)*Integral_{0..inf} (sin x / x)^n dx.
 * @author Sean A. Irvine
 */
public class A002297 implements Sequence {

  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;
  private int mN = 0;

  protected Z extract(final Q t) {
    return t.num();
  }

  @Override
  public Z next() {
    ++mN;
    Q s = Q.ZERO;
    for (int r = 0; r < (mN + 1) / 2; ++r) {
      final Q t = new Q(Z.valueOf(mN - 2 * r).pow(mN - 1), mF.factorial(r).multiply(mF.factorial(mN - r)));
      s = s.signedAdd((r & 1) == 0, t);
    }
    return extract(s.multiply(mN).divide(Z.ONE.shiftLeft(mN - 1)));
  }
}
