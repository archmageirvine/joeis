package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A046268 Largest prime substring in 2^n (0 if none).
 * @author Sean A. Irvine
 */
public class A046268 implements Sequence {

  private Z mA = null;

  static String largestPrimeSubstring(final String s) {
    String largest = "0";
    for (int start = 0; start <= s.length() - largest.length(); ++start) {
      if (s.charAt(start) != '0') {
        for (int end = start + largest.length(); end <= s.length(); ++end) {
          final String sub = s.substring(start, end);
          if ((sub.length() > largest.length() || sub.compareTo(largest) > 0) && new Z(sub).isProbablePrime()) {
            largest = sub;
          }
        }
      }
    }
    return largest;
  }

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.multiply2();
    return new Z(largestPrimeSubstring(mA.toString()));
  }
}
