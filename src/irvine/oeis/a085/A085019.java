package irvine.oeis.a085;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a083.A083752;

/**
 * A085019 a(n) = A083752(A085018(n)).
 * @author Sean A. Irvine
 */
public class A085019 extends Sequence1 {

  private final DirectSequence mS = new A083752();
  private long mN = 0;

  private boolean is(final long n) {
    final Z t = mS.a(n);
    for (final Z dd : Jaguar.factor(n).divisors()) {
      final long d = dd.longValue();
      if (d < n && t.equals(mS.a(d).multiply(n / d))) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      if (is(++mN)) {
        return mS.a(mN);
      }
    }
  }
}
