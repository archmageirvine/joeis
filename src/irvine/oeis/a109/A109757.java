package irvine.oeis.a109;

import irvine.math.z.Z;
import irvine.oeis.SemiprimeSequence;

/**
 * A109757 Numbers n such that (10's complement factorial of n) + 1 is semiprime.
 * @author Sean A. Irvine
 */
public class A109757 extends SemiprimeSequence {

  private static long tensComplement(final long n) {
    long s = 1;
    while (s <= n) {
      s *= 10L;
    }
    return s - n;
  }

  static Z tensComplementFactorial(final long n) {
    Z p = Z.ONE;
    for (long k = 1; k <= n; ++k) {
      p = p.multiply(tensComplement(k));
    }
    return p;
  }

  @Override
  protected Z candidate(final int n) {
    return tensComplementFactorial(n).add(1);
  }
}

