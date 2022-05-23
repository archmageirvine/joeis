package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.StringUtils;

/**
 * A057116 n = a*b where ab is cyclic permutation of n.
 * @author Sean A. Irvine
 */
public class A057116 implements Sequence {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private long mN = 9;

  @Override
  public Z next() {
    while (true) {
      final String s = String.valueOf(++mN);
      final int len = s.length();
      for (int k = 0; k < s.length(); ++k) {
        // k is where we are starting in s (cyclic)
        if (s.charAt(k) != '0') {
          for (int j = 1; j < s.length(); ++j) {
            // j is where the multiplication sign is
            if (s.charAt((k + j) % len) != '0') {
              long a = 0;
              for (int i = 0; i < j; ++i) {
                a *= 10;
                a += s.charAt((k + i) % len) - '0';
              }
              long b = 0;
              for (int i = j; i < s.length(); ++i) {
                b *= 10;
                b += s.charAt((k + i) % len) - '0';
              }
              if (a * b == mN) {
                if (mVerbose) {
                  StringUtils.message(a + " * " + b + " = " + mN);
                }
                return Z.valueOf(mN);
              }
            }
          }
        }
      }
    }
  }
}
