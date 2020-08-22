package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008467 a(n) = n OR n^2 (applied to ternary expansions).
 * @author Sean A. Irvine
 */
public class A008467 implements Sequence {

  private Z mN = Z.ZERO;

  static String ternaryOr(final String n, final String s) {
    assert s.length() >= n.length();
    final StringBuilder res = new StringBuilder();
    for (int k = 0, j = n.length() - s.length(); k < s.length(); ++k, ++j) {
      final int vs = s.charAt(k) - '0';
      final int vn = j < 0 ? 0 : (n.charAt(j) - '0');
      final int or = Integer.max(vs, vn);
      res.append((char) ('0' + or));
    }
    return res.toString();
  }

  @Override
  public Z next() {
    mN = mN.add(1);
    final String n = mN.toString(3);
    final String s = mN.square().toString(3);
    return new Z(ternaryOr(n, s), 3);
  }
}
