package irvine.oeis.a045;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.a000.A000720;
import irvine.oeis.a007.A007504;
import irvine.oeis.memory.MemoryFunction2Sequence;

/**
 * A045450 Number of partitions of n into a prime number of distinct prime parts.
 * @author Sean A. Irvine
 */
public class A045450 extends MemoryFunction2Sequence<Integer, Polynomial<Z>> {

  /** Construct the sequence. */
  public A045450() {
    super(5);
  }

  // After Alois P. Heinz

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private final MemorySequence mPiSeq = MemorySequence.cachedSequence(new A000720());
  private final MemorySequence mS = MemorySequence.cachedSequence(new A007504());
  private final MemorySequence mPrime = MemorySequence.cachedSequence(new PrependSequence(new A000040(), 0));
  private int mN = 4;

  @Override
  protected Polynomial<Z> compute(final Integer n, final Integer m) {
    if (n == 0) {
      return RING.one();
    }
    if (mS.a(m).intValueExact() < n) {
      return RING.zero();
    }
    final Polynomial<Z> b = get(n, m - 1);
    final int pi = mPrime.a(m).intValueExact();
    return pi > n ? b : RING.add(b, get(n - pi, m - 1).shift(1));
  }

  @Override
  public Z next() {
    final Polynomial<Z> p = get(++mN, mPiSeq.a(mN).intValue());
    Z sum = Z.ZERO;
    int pr;
    for (int k = 1; (pr = mPrime.a(k).intValueExact()) <= p.degree(); ++k) {
      sum = sum.add(p.coeff(pr));
    }
    return sum;
  }
}
