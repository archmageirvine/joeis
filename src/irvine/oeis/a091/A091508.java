package irvine.oeis.a091;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A091508 Let b(1)=n; b(k+1)=b(k)/gcd(k,b(k)) if gcd(k,b(k))&gt;1; b(k+1)=b(k)+k otherwise, sequence gives least k such that b(k)=1.
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
