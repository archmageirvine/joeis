package irvine.oeis.a084;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A084366 Numbers k such that the k-th prime number has an odd number of digits and becomes composite if the central digit is removed.
 * @author Sean A. Irvine
 */
public class A084366 extends A000040 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z p = super.next();
      final String s = p.toString();
      final int len = s.length();
      if (len > 1 && (len & 1) == 1) {
        final Z t = new Z(s.substring(0, len / 2) + s.substring(len / 2 + 1));
        if (!t.isProbablePrime()) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}
