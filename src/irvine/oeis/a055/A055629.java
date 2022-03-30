package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A055629 Beginning of first run of at least n consecutive happy numbers.
 * @author Sean A. Irvine
 */
public class A055629 implements Sequence {

  private static final String[] TERMS = {
    "1",
    "31",
    "1880",
    "7839",
    "44488",
    "78{9:12}5{9:9}6",
    "78{9:12}5{9:9}6",
    "58{9:11}6{9:144}5",
    "26{9:137}7{9:74}5",
    "38{9:560}0{9:87}5",
    "27{9:280}0{9:1287}4",
    "388{9:158021}8{9:136}4",
    "288{9:218491}3{9:385203}3",
    // "7888{9:1604938271577}1{9:345696}3",  // Exceeds range of Z
  };
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN >= TERMS.length) {
      throw new UnsupportedOperationException();
    }
    final StringBuilder sb = new StringBuilder();
    final String t = TERMS[mN];
    int s = 0;
    while (s < t.length()) {
      final int brace = t.indexOf('{', s);
      if (brace < 0) {
        sb.append(t.substring(s));
        s = t.length();
      } else {
        sb.append(t, s, brace);
        final int split = t.indexOf(':', brace);
        final int close = t.indexOf('}', split);
        final String u = t.substring(brace + 1, split);
        for (int k = 0; k < Integer.parseInt(t.substring(split + 1, close)); ++k) {
          sb.append(u);
        }
        s = close + 1;
      }
    }
    return new Z(sb);
  }
}
