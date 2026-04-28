package irvine.oeis.a394;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A394345 allocated for Lei Zhou.
 * @author Sean A. Irvine
 */
public class A394345 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final Z n2 = Z.valueOf(2 * ++mN);
    long m = 0;
    while (true) {
      ++m;
      final Z t = n2.pow(m).subtract(1).divide(2 * mN - 1);
      for (long k = m - 1; k > 0; --k) {
        final Z u = t.subtract(n2.pow(k - 1));
        if (u.isProbablePrime()) {
          return u;
        }
      }
    }
  }
}
