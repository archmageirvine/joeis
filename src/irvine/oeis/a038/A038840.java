package irvine.oeis.a038;

import irvine.math.z.Z;

/**
 * A038840 Cubes that are concatenations of primes.
 * @author Sean A. Irvine
 */
public class A038840 extends A038692 {

  private long mN = 2;

  @Override
  public Z next() {
    while (true) {
      final Z n3 = Z.valueOf(++mN).pow(3);
      final String s = n3.toString();
      final char last = s.charAt(s.length() - 1);
      if (last == '2' || (last & 1) == 1) {
        for (int k = 1; k < s.length(); ++k) {
          if (new Z(s.substring(0, k)).isProbablePrime() && isPrimeDecomposable(s.substring(k))) {
            return n3;
          }
        }
      }
    }
  }
}
