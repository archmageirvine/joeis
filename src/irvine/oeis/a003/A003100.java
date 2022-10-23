package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A003100 Decimal Gray code for n.
 * @author Sean A. Irvine
 */
public class A003100 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    long r = 0;
    final String s = new StringBuilder().append(mN).reverse() + "0";
    for (int k = s.length() - 2; k >= 0; --k) {
      final int t = (s.charAt(k + 1) & 1) == 0 ? s.charAt(k) - '0' : '9' - s.charAt(k);
      r *= 10;
      r += t;
    }
    return Z.valueOf(r);
  }
}
