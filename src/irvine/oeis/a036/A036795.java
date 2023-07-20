package irvine.oeis.a036;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a001.A001906;

/**
 * A036795 Integers that can be decomposed into sums of different Fibonacci numbers of even argument.
 * @author Sean A. Irvine
 */
public class A036795 extends Sequence0 {

  private Z mN = Z.ZERO;
  private final MemorySequence mF2 = MemorySequence.cachedSequence(source());

  protected Sequence source() {
    return new A001906();
  }

  private boolean is(final Z n, final int k) {
    if (n.isZero()) {
      return true;
    }
    if (k < 1) {
      return false;
    }
    return is(n.subtract(mF2.a(k)), k - 1) | is(n, k - 1);
  }

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      int k = 1;
      while (mF2.a(k).compareTo(mN) < 0) {
        ++k;
      }
      if (is(mN.subtract(1), k)) {
        return mN;
      }
    }
  }
}

