package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.a003.A003285;

/**
 * A065082 Numbers k such that (period of the continued fraction for sqrt(k))^3 = k.
 * @author Sean A. Irvine
 */
public class A065082 extends A003285 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z n = Z.valueOf(++mN).pow(3);
      if (period(n).pow(3).equals(n)) {
        return n;
      }
    }
  }
}
