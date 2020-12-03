package irvine.oeis.a007;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.a005.A005835;

/**
 * A007620 Numbers n such that every k &lt;= n is a sum of proper divisors of n (for n&gt;1).
 * @author Sean A. Irvine
 */
public class A007620 extends A005835 {

  private boolean mFirst = true;

  private boolean isSum(final Z k, final Z[] d, final int pos) {
    if (k.isZero()) {
      return true;
    }
    int p = pos;
    while (p >= 0) {
      final Z t = k.subtract(d[p]);
      if (t.signum() >= 0 && isSum(t, d, p - 1)) {
        return true;
      }
      --p;
    }
    return false;
  }

  private boolean isProperPractical(final Z n) {
    final Z[] d = Cheetah.factor(n).divisors();
    for (Z k = n; k.signum() > 0; k = k.subtract(1)) {
      if (!isSum(k, d, d.length - 1)) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    if (mFirst) {
      mFirst = false;
      return Z.ONE;
    }
    while (true) {
      final Z n = super.next();
      if (isProperPractical(n)) {
        return n;
      }
    }
  }
}
