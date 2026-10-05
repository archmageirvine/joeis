package irvine.oeis.a065;

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.oeis.a028.A028296;
import irvine.oeis.memory.MemorySequence;
import irvine.oeis.triangle.DirectArray;

/**
 * A065547 Triangle of Salie numbers.
 * @author Sean A. Irvine
 */
public class A065547 extends Sequence0 implements DirectArray {

  private final MemorySequence mG = MemorySequence.cachedSequence(new A028296());
  private int mN = 0;
  private int mM = -1;

  protected Z t(final int n, final int m) {
    return Integers.SINGLETON.sum(0, n - m, k -> mG.a(k).multiply(Binomial.binomial(2L * n, 2L * k)).multiply(Binomial.binomial(n - k, n - m - k))).shiftRight(2L * (n - m));
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return t(mN, mM);
  }

  @Override
  public Z a(final long n, final long k) {
    return t((int) n, (int) k);
  }

}

