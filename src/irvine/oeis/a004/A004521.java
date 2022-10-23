package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A004521 Generalized nim sum n + n in base 11.
 * @author Sean A. Irvine
 */
public class A004521 extends Sequence0 {

  private Z mN = Z.NEG_ONE;

  private int r(final String s, final int n, final int base) {
    return n < 0 ? 0 : Integer.parseInt(s.substring(n, n + 1), base);
  }

  // Cf. A004514, but this one supports base > 10, but is less efficient
  protected Z nimsum(final int base, final Z a, final Z b) {
    final String as = a.toString(base);
    final String bs = b.toString(base);
    final StringBuilder sb = new StringBuilder();
    for (int k = Math.max(as.length(), bs.length()); k >= 1; --k) {
      final int r = (r(as, as.length() - k, base) + r(bs, bs.length() - k, base)) % base;
      sb.append(Integer.toString(r, base));
    }
    return new Z(sb, base);
  }

  @Override
  public Z next() {
    mN = mN.add(1);
    return nimsum(11, mN, mN);
  }
}

