package irvine.oeis.a022;

import java.util.ArrayList;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunction2Sequence;
import irvine.util.array.LongDynamicLongArray;

/**
 * A022894 Number of solutions to c(1)*prime(1) +...+ c(2n+1)*prime(2n+1) = 0, where c(i) = +-1 for i &gt; 1, c(1) = 1.
 * @author Sean A. Irvine
 */
public class A022894 extends MemoryFunction2Sequence<Long, Z> {

  /** Construct the sequence. */
  public A022894() {
    this(0);
  }

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A022894(final int offset) {
    super(offset);
  }

  // After Alois P. Heinz

  private long mN = -1;
  private final Fast mPrime = new Fast();
  private final LongDynamicLongArray mPrimes = new LongDynamicLongArray();
  private final ArrayList<Z> mSumPrimes = new ArrayList<>();

  {
    mPrimes.set(0, start());
    mSumPrimes.add(Z.ZERO);
    mSumPrimes.add(Z.ZERO);
  }

  protected long start() {
    return 0;
  }

  private long p(final long n) {
    while (n >= mPrimes.length()) {
      mPrimes.set(mPrimes.length(), mPrime.nextPrime(mPrimes.get(mPrimes.length() - 1)));
    }
    return mPrimes.get(n);
  }

  private Z sp(final int n) {
    while (n >= mSumPrimes.size()) {
      mSumPrimes.add(mSumPrimes.get(mSumPrimes.size() - 1).add(p(mSumPrimes.size())));
    }
    return mSumPrimes.get(n);
  }

  @Override
  protected Z compute(final Long n, final Long i) {
    if (Z.valueOf(n).compareTo(sp(i.intValue())) > 0) {
      return Z.ZERO;
    }
    if (i == 1) {
      return Z.ONE;
    }
    return get(n + p(i), i - 1).add(get(Math.abs(n - p(i)), i - 1));
  }

  @Override
  public Z next() {
    mN += 2;
    return get(2L, mN);
  }
}
