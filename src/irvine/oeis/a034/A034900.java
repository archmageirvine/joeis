package irvine.oeis.a034;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A034900 a(n) is square mod a(i), i &lt; n; a(n) prime; a(1) = 2.
 * @author Sean A. Irvine
 */
public class A034900 extends MemorySequence {

  {
    setOffset(1);
  }

  private final Fast mPrime = new Fast();

  private boolean isSquare(final Z p) {
    for (final Z t : this) {
      if (p.jacobi(t) != 1) {
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
      if (isSquare(p)) {
        return p;
      }
    }
  }
}
