package irvine.oeis.a064;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A064097 A quasi-logarithm defined inductively by a(1) = 0 and a(p) = 1 + a(p-1) if p is prime and a(n*m) = a(n) + a(m) if m,n &gt; 1.
 * @author Sean A. Irvine
 */
public class A064097 extends CachedSequence {

  private static final Fast PRIME = new Fast();

  /** Construct the sequence. */
  public A064097() {
    super(1, Integer.class, (self, n) -> {
      if (n == 1) {
        return Z.ZERO;
      }
      if (PRIME.isPrime(n)) {
        return self.a(n - 1).add(1);
      }
      final int lpf = Functions.LPF.i(n);
      return self.a(lpf).add(self.a(n / lpf));
    });
  }
}
