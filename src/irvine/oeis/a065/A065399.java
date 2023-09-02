package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A065399 a(n) is the greatest integer m such that (1) written in base n it is also readable as if it is in factorial base and (2) this factorial base value is smaller than or equal to m.
 * @author Sean A. Irvine
 */
public class A065399 extends Sequence2 {

  private int mBase = 1;

  protected Z f(Z m) {
    Z res = Z.ZERO;
    Z f = Z.ONE;
    long k = 1;
    while (!m.isZero()) {
      res = res.add(f.multiply(m.mod(mBase)));
      f = f.multiply(++k);
      m = m.divide(mBase);
    }
    return res;
  }

  private boolean is(final Z m) {
    return f(m).compareTo(m) <= 0;
  }

  @Override
  public Z next() {
    ++mBase;
    Z t = Z.ZERO;
    Z d = Z.ONE;
    for (long k = 1; k < mBase; ++k) {
      t = t.add(d.multiply(k));
      d = d.multiply(mBase);
    }
    Z best = t;
    while (true) {
      for (long k = 1; k < mBase; ++k) {
        final Z m = t.add(d.multiply(k));
        if (!is(m)) {
          return best;
        }
        best = m;
      }
      t = best;
      d = d.multiply(mBase);
    }
  }
}
