package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A038692 Square numbers that are concatenations of two or more prime numbers.
 * @author Sean A. Irvine
 */
public class A038692 implements Sequence {

  private long mN = 4;

  private boolean isPrimeDecomposable(final String s) {
    if (s.startsWith("0")) {
      return false;
    }
    if (new Z(s).isProbablePrime()) {
      return true;
    }
    for (int k = 1; k < s.length(); ++k) {
      if (new Z(s.substring(0, k)).isProbablePrime() && isPrimeDecomposable(s.substring(k))) {
        return true;
      }
    }
    return false;
  }

  @Override
  public Z next() {
    while (true) {
      final Z n2 = Z.valueOf(++mN).square();
      final String s = n2.toString();
      final char last = s.charAt(s.length() - 1);
      if (last == '2' || (last & 1) == 1) {
        for (int k = 1; k < s.length(); ++k) {
          if (new Z(s.substring(0, k)).isProbablePrime() && isPrimeDecomposable(s.substring(k))) {
            return n2;
          }
        }
      }
    }
  }
}
