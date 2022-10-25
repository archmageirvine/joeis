package irvine.oeis.a034;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A034902 a(i) is square mod a(j), i &lt;&gt; j; a(n) prime; a(1) = 2.
 * @author Sean A. Irvine
 */
public class A034902 extends MemorySequence {

  {
    setOffset(1);
  }

  private final Fast mPrime = new Fast();

  private boolean isSquare(final Z p) {
    for (final Z t : this) {
      if (p.jacobi(t) != 1 || t.jacobi(p) != 1) {
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
    Z p = get(size() - 1);
    while (true) {
      p = mPrime.nextPrime(p);
      if (isSquare(p)) {
        return p;
      }
    }
  }
}
