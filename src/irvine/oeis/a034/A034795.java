package irvine.oeis.a034;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.memory.MemorySequence;

/**
 * A034795 a(n) is the least prime &gt; a(n-1) that is a quadratic residue mod a(n-1).
 * @author Sean A. Irvine
 */
public class A034795 extends MemorySequence {

  {
    setOffset(1);
  }

  private final Fast mPrime = new Fast();

  @Override
  protected Z computeNext() {
    if (size() == 0) {
      return Z.TWO;
    }
    final Z prev = a(size() - 1);
    Z p = prev;
    while (true) {
      p = mPrime.nextPrime(p);
      if (ZUtils.isQuadraticResidue(p, prev)) {
        return p;
      }
    }
  }
}
