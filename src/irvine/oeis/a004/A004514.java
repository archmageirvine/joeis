package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004514.
 * @author Sean A. Irvine
 */
public class A004514 implements Sequence {

  private int r(final String s, final int n) {
    return n < 0 ? 0 : s.charAt(n) - '0';
  }

  protected Z nimsum(final int base, final Z a, final Z b) {
    if (base > 10) {
      throw new UnsupportedOperationException();
    }
    final String as = a.toString(base);
    final String bs = b.toString(base);
    final StringBuilder sb = new StringBuilder();
    for (int k = Math.max(as.length(), bs.length()); k >= 1; --k) {
      final int r = (r(as, as.length() - k) + r(bs, bs.length() - k)) % base;
      sb.append(r);
    }
    return new Z(sb, base);
  }

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return nimsum(4, mN, mN);
  }
}

