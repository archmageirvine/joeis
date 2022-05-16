package irvine.oeis.a058;

import java.util.ArrayList;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a000.A000084;

/**
 * A058352 a(n) Sum_{d|n, 1&lt;=d&lt;n} d*A000084(d).
 * @author Sean A. Irvine
 */
public class A058352 extends A000084 {

  protected final ArrayList<Z> mS = new ArrayList<>();
  {
    mS.add(Z.ZERO);
  }
  private int mN = 0;

  protected boolean accept(final int d) {
    return d < mN;
  }

  @Override
  public Z next() {
    mS.add(super.next());
    Z sum = Z.ZERO;
    if (++mN > 0) {
      for (final Z d : Jaguar.factor(mN).divisors()) {
        final int dd = d.intValueExact();
        if (accept(dd)) {
          sum = sum.add(mS.get(dd).multiply(d));
        }
      }
    }
    return sum;
  }
}

