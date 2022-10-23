package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A048678 Binary expansion of nonnegative integers expanded to "Zeckendorffian format" with rewrite rules 0-&gt;0, 1-&gt;01.
 * @author Sean A. Irvine
 */
public class A048678 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    final String s = Long.toBinaryString(++mN);
    long u = 0;
    for (int k = 0; k < s.length(); ++k) {
      if (s.charAt(k) == '0') {
        u <<= 1;
      } else {
        u <<= 2;
        ++u;
      }
    }
    return Z.valueOf(u);
  }
}

