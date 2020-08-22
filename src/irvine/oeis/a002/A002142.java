package irvine.oeis.a002;

import irvine.math.group.QuadraticFieldUtils;
import irvine.math.z.Z;

/**
 * A002142 Primes p == 1 (mod 4) where class number of Q(sqrt p) increases.
 * @author Sean A. Irvine
 */
public class A002142 extends A002144 {

  private long mH = 0;

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final long h = QuadraticFieldUtils.classNumber(p);
      if (h > mH) {
        mH = h;
        return p;
      }
    }
  }
}
