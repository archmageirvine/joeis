package irvine.oeis.a161;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A161978.
 * @author Sean A. Irvine
 */
public class A161978 implements Sequence {

  private long mN = 0;

  private String reverse(final String s) {
    final StringBuilder sb = new StringBuilder();
    int k = s.length() - 1;
    while (s.charAt(k) == '0') {
      --k;
    }
    while (k >= 0) {
      sb.append(s.charAt(k--));
    }
    return sb.toString();
  }

  @Override
  public Z next() {
    long m = ++mN;
    final String a = Long.toBinaryString(m);
    final String b = reverse(a);
    while (true) {
      final String t = Long.toBinaryString(m);
      if (t.contains(b) && t.contains(a)) {
        return Z.valueOf(m);
      }
      ++m;
    }
  }
}

