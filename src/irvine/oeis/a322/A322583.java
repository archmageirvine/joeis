package irvine.oeis.a322;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A322583 a(n) is the number of factorizations of n into factorial numbers larger than one; a(1) = 1.
 * @author Sean A. Irvine
 */
public class A322583 extends MemorySequence {

  // After Antti Karttunen

  protected final MemoryFactorial mF = new MemoryFactorial();
  {
    add(Z.ZERO); // 0 unused
  }

  private long calculate(final long n, final long m) {
    if (n == 1) {
      return 1;
    }
    long sum = 0;
    long f;
    int k = 1;
    while ((f = mF.factorial(++k).longValueExact()) <= m) {
      if (n % f == 0) {
        sum += calculate(n / f, f);
      }
    }
    return sum;
  }

  @Override
  protected Z computeNext() {
    return Z.valueOf(calculate(size(), size()));
  }
}
