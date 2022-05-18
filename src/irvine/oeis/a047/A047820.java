package irvine.oeis.a047;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a002.A002808;

/**
 * A047820 Composite numbers that become prime after exactly 1 iteration of f(k) = sum of distinct prime factors of k.
 * @author Sean A. Irvine
 */
public class A047820 extends A002808 {

  private Z sopf(final Z n) {
    return ZUtils.sum(Jaguar.factor(n).toZArray());
  }

  protected int iterations() {
    return 1;
  }

  @Override
  public Z next() {
    outer:
    while (true) {
      final Z composite = super.next();
      Z s = composite;
      for (int k = 1; k < iterations(); ++k) {
        s = sopf(s);
        if (s.isProbablePrime()) {
          continue outer;
        }
      }
      if (sopf(s).isProbablePrime()) {
        return composite;
      }
    }
  }
}
