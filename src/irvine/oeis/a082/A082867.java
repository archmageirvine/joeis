package irvine.oeis.a082;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A082867 Numbers n such that there exists a proper divisor 1 &lt; m &lt; n where m divides n and m+1 divides n+1, but there is no divisor d such that d divides n, d+1 divides n+1 and d+2 divides n+2.
 * @author Sean A. Irvine
 */
public class A082867 extends Sequence1 {

  private int mN = 7;

  @Override
  public Z next() {
    while (true) {
      boolean ok = false;
      final Z n = Z.valueOf(++mN);
      for (final Z dd : Jaguar.factor(n).divisors()) {
        final long d = dd.longValue();
        if (d != 1 && d != mN && (mN + 1) % (d + 1) == 0) {
          if ((mN + 2) % (d + 2) == 0) {
            ok = false;
            break;
          }
          ok = true;
        }
      }
      if (ok) {
        return n;
      }
    }
  }
}
