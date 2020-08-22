package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001083 Length of one version of Kolakoski sequence {A000002(i)} at n-th growth stage.
 * @author Sean A. Irvine
 */
public class A001083 implements Sequence {

  private String mS = "";

  private String rewrite(final String s) {
    if (s.isEmpty()) {
      return "2";
    }
    final StringBuilder sb = new StringBuilder();
    for (int k = 0; k < s.length(); ++k) {
      final char c = (char) ('1' + (k & 1));
      for (int j = '1'; j <= s.charAt(k); ++j) {
        sb.append(c);
      }
    }
    return sb.toString();
  }

  @Override
  public Z next() {
    mS = rewrite(mS);
    //System.out.println(mS);
    return Z.valueOf(mS.length());
  }
}

