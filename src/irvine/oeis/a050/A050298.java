package irvine.oeis.a050;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.a008.A008578;
import irvine.oeis.memory.MemoryFunction2Sequence;

/**
 * A050298 Triangle read by rows: T(n,k) = p(r), where r is the (n-k+1)-th number such that A001222(r+1) = k, and p(r) is the r-th prime.
 * @author Sean A. Irvine
 */
public class A050298 extends MemoryFunction2Sequence<Integer, Z> {

  /** Construct the sequence. */
  public A050298() {
    super(1);
  }

  private final MemorySequence mPrimes = MemorySequence.cachedSequence(new A008578());
  private int mN = 0;
  private int mM = 0;

  @Override
  protected Z compute(final Integer n, final Integer m) {
    if (n.equals(m)) {
      return Z.ONE.shiftLeft(n).subtract(1);
    }
    Z k = get(n - 1, m);
    while (true) {
      k = k.add(1);
      if (Jaguar.factor(k.add(1)).bigOmega() == m) {
        return k;
      }
    }
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return mPrimes.a(get(mN, mM).intValueExact());
  }
}
