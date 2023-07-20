package irvine.oeis.a034;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.memory.MemorySequence;

/**
 * A034794 a(n) is the least prime p &gt; a(n-1) such that a(n-1) is a quadratic residue mod p.
 * @author Sean A. Irvine
 */
public class A034794 extends MemorySequence {

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
      if (ZUtils.isQuadraticResidue(prev, p)) {
        return p;
      }
    }
  }
}
