package irvine.oeis.a236;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;
import irvine.oeis.a007.A007821;
import irvine.oeis.a008.A008578;
import irvine.oeis.memory.MemoryFunctionInt2Sequence;

/**
 * A236542 Array T(n,k) read along descending antidiagonals: row n contains the primes with n steps in the prime index chain.
 * @author Sean A. Irvine
 */
public class A236542 extends MemoryFunctionInt2Sequence<Z> {

  /** Construct the sequence. */
  public A236542() {
    super(1);
  }

  private final MemorySequence mA = MemorySequence.cachedSequence(new A007821());
  private final MemorySequence mPrimes = MemorySequence.cachedSequence(new A008578());
  private int mN = 1;
  private int mM = 0;

  @Override
  protected Z compute(final int n, final int k) {
    if (n == 1) {
      return mA.a(k - 1);
    }
    return mPrimes.a(get(n - 1, k).intValueExact());
  }

  @Override
  public Z next() {
    if (--mM < 1) {
      mM = mN;
      ++mN;
    }
    return get(mN - mM, mM);
  }
}
