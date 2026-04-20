package irvine.oeis.a091;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A091508 Least k such that b(k) = 1, where b(1) = n and b(k+1) = b(k)+k+1 if gcd(k+1, b(k)) = 1 or else b(k)/gcd(k+1, b(k)).
 * @author Sean A. Irvine
 */
public class A091508 extends Sequence1 {

  // After M. F. Hasler

  private long mN = 0;

  @Override
  public Z next() {
    long n = ++mN;
    long k = 1;
    while (true) {
      ++k;
      if (n == 1) {
        return Z.valueOf(k - 1);
      }
      final long g = Functions.GCD.l(n, k);
      if (g > 1) {
        n /= g;
      } else {
        n += k;
      }
    }
  }
}
