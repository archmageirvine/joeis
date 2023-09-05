package irvine.oeis.a065;

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.oeis.a028.A028296;
import irvine.oeis.memory.MemorySequence;

/**
 * A065547 Triangle of Salie numbers.
 * @author Sean A. Irvine
 */
public class A065547 extends Sequence0 {

  private final MemorySequence mG = MemorySequence.cachedSequence(new A028296());
  private int mN = -1;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return Integers.SINGLETON.sum(0, mN - mM, k -> mG.a(k).multiply(Binomial.binomial(2L * mN, 2L * k)).multiply(Binomial.binomial(mN - k, mN - mM - k))).shiftRight(2L * (mN - mM));
  }
}

