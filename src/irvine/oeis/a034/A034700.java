package irvine.oeis.a034;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A034700 a(n) = smallest prime == 1 (mod 4) such that a(n) is a square mod a(i), all i&lt;n.
 * @author Sean A. Irvine
 */
public class A034700 extends MemorySequence {

  {
    setOffset(1);
  }

  private final Fast mPrime = new Fast();

  private boolean isSquares(final Z mod) {
    for (final Z p : this) {
      if (p.jacobi(mod) != 1) {
        return false;
      }
    }
    return true;
  }

  @Override
  protected Z computeNext() {
    if (size() == 0) {
      return Z.FIVE;
    }
    Z p = a(size() - 1);
    while (true) {
      p = mPrime.nextPrime(p);
      if (p.mod(4) == 1 && isSquares(p)) {
        return p;
      }
    }
  }
}

