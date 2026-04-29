package irvine.oeis.a087;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A087097 Lunar primes (formerly called dismal primes) (cf. A087062).
 * @author Sean A. Irvine
 */
public class A087097 extends FilterNumberSequence {

  private static int min(final String s) {
    int min = s.charAt(0) - '0';
    for (int k = 1; k < s.length(); ++k) {
      min = Math.min(min, s.charAt(k) - '0');
    }
    return min;
  }

  private static long fromDigits(final int[] v) {
    long x = 0;
    for (final int digit : v) {
      x = 10 * x + digit;
    }
    return x;
  }

  private static long pow10(final int e) {
    return Z.TEN.pow(e).longValueExact();
  }

  private static boolean generateVectors(final int[] v, final int pos, final long n, final int l, final int len) {
    if (pos == l) {
      final Z m = Z.valueOf(fromDigits(v));
      final int kLen = len - l;
      final long start = pow10(kLen);
      final long end = pow10(kLen + 1) - 1;
      for (long k = start; k <= end; ++k) {
        if (A087062.lunarMul(m, Z.valueOf(k)).equals(n)) {
          return true;
        }
      }
      return false;
    }

    for (int digit = 0; digit <= 9; ++digit) {
      v[pos] = digit;
      if (generateVectors(v, pos + 1, n, l, len)) {
        return true;
      }
    }
    return false;
  }

  /** Construct the sequence. */
  public A087097() {
    super(1, n -> {
      if (n < 100) {
        return n > 88 || (n % 10 == 9 && n > 9);
      }
      if ((Functions.SYNDROME.i(n) & 0b1000000000) == 0) {
        return false; // no 9
      }
      final String d = String.valueOf(n);
      if (d.length() < 5) {
        return min(d) < Math.min(d.charAt(0) - '0', d.charAt(d.length() - 1) - '0');
      }
      for (int l = d.length() / 2; l < d.length(); ++l) {
        if (generateVectors(new int[l], 0, n, l, d.length())) {
          return false;
        }
      }
      return true;
    });
  }
}
