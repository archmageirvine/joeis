package irvine.oeis.a045;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A045998 Binary Gleichniszahlen-Reihe (BGR) sequence: describe previous term (cf. A005150), reduce number of digits seen mod 2 (then for the purposes of this data-base, discard leading zeros).
 * @author Sean A. Irvine
 */
public class A045998 implements Sequence {

  private String mA = null;

  static String lookAndSayMod2(final CharSequence n) {
    final StringBuilder sb = new StringBuilder();
    int cnt = 0;
    char p = 0;
    for (int k = 0; k < n.length(); ++k) {
      final char c = n.charAt(k);
      if (c == p) {
        ++cnt;
      } else {
        if (p != 0) {
          sb.append(cnt & 1).append(p);
        }
        p = c;
        cnt = 1;
      }
    }
    sb.append(cnt & 1).append(p);
    return sb.toString();
  }

  @Override
  public Z next() {
    if (mA == null) {
      mA = "1";
    } else {
      mA = lookAndSayMod2(mA);
    }
    return new Z(mA);
  }
}
