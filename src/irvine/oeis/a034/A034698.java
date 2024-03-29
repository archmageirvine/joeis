package irvine.oeis.a034;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A034698 a(n) is the smallest prime such that a(1), ..., a(n-1) are squares mod a(n).
 * @author Sean A. Irvine
 */
public class A034698 extends MemorySequence {

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
      return Z.TWO;
    }
    Z p = a(size() - 1);
    while (true) {
      p = mPrime.nextPrime(p);
      if (isSquares(p)) {
        return p;
      }
    }
  }
}

