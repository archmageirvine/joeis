package irvine.oeis.a019;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.util.array.LongDynamicByteArray;

/**
 * A019268 Let Dedekind's psi(m) = product of (p+1)p^(e-1) for primes p, where p^e is a factor of m. Iterating psi(m) eventually results in a number of form 2^a*3^b. a(n) is the smallest number that requires n steps to reach such a number.
 * @author Sean A. Irvine
 */
public class A019268 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A019268(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A019268() {
    super(0);
  }

  // 16 GB table
  private static final long TABLE_LIMIT = 1L << 34;

  // Keep historical values (increased by 1 so 0 can be sentinel)
  private final LongDynamicByteArray mCache = new LongDynamicByteArray();
  private int mN = -1;
  private long mM = 1;

  private boolean isTerminal(final long n) {
    long m = n;
    while ((m & 1) == 0) {
      m >>= 1;
    }
    while (m % 3 == 0) {
      m /= 3;
    }
    return m == 1;
  }

  protected int count(final long n) {
    if (n > TABLE_LIMIT) {
      // For large values recompute to avoid excessive table size
      return isTerminal(n) ? 0 : count(Functions.DEDEKIND_PSI.l(n)) + 1;
    }
    final int res = mCache.get(n);
    if (res != 0) {
      return res - 1;
    }
    if (isTerminal(n)) {
      mCache.set(n, (byte) 1);
      return 0;
    }
    final int r = count(Functions.DEDEKIND_PSI.l(n)) + 1;
    mCache.set(n, (byte) (r + 1));
    return r;
  }

  @Override
  public Z next() {
    ++mN;
    while (count(mM) < mN) {
      ++mM;
    }
    return Z.valueOf(mM);
  }
}
