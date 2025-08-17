package irvine.oeis.a079;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A079465.
 * @author Sean A. Irvine
 */
public class A079475 extends Sequence0 {

  // After Chai Wah Wu

  private long mN = -1;

  @Override
  public Z next() {
    String s = String.valueOf(++mN);
    final int l = s.length();
    if ((l & 1) == 1) {
      s = s.substring(0, l - 1) + "1" + s.charAt(s.length() - 1);
    }
    final StringBuilder sb = new StringBuilder();
    for (int k = 0; k < l; k += 2) {
      sb.append(s.substring(k + 1, k + 2).repeat(s.charAt(k) - '0'));
    }
    return new Z(sb);
  }
}
