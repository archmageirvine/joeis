package irvine.oeis.a384;
// manually 2026-01-10

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunctionInt2Sequence;
import irvine.oeis.triangle.DirectArray;

/**
 * A384801 Square array A(n,k), n &gt;= 0, k &gt;= 0, read by antidiagonals downwards, where column k is the expansion of e.g.f. B(x)^k, where B(x) is the e.g.f. of A213108.
 * where column k is the expansion of e.g.f. B(x)^k, where B(x) is the e.g.f. of A213108.
 * @author Georg Fischer
 */
public class A384801 extends MemoryFunctionInt2Sequence<Q> implements DirectArray {

  private final int mA; // factor of n
  private final int mB; // factor of first j
  private final int mC; // factor of second j
  private final int mKNeg; // -1 for (-1)^n*k
  private final int mJStart; // start for loop over j
  private final int mTNeg; // whether second parameter of get() in t is negative

  private int mN; // row index
  private int mM; // columns index

  /** Construct the sequence. */
  public A384801() {
    this(0, -1, 1, 1, -1, 1, -1);
  }

  /**
   * Generic constructor with parameters.
   * @param a first parameter
   * @param b second parameter
   * @param c third parameter
   * @param kNeg -1 for (-1)^n*k, else 1
   * @param jStart start for loop over j
   * @param tNeg -1 when second parameter of get() in t is negative, 1 otherwise
   * @param  offset first index
   */
  public A384801(final int offset, final int a, final int b, final int c, final int kNeg, final int jStart, final int tNeg) {
    super(offset);
    mA = a;
    mB = b;
    mC = c;
    mKNeg = kNeg;
    mJStart = jStart;
    mTNeg = tNeg;

    mN = offset - 1;
    mM = offset;
  }

  @Override
  protected Q compute(final int n, final int k) {
    // b(n,k) = 0^n if n*k=0, otherwise b(n,k) = (-1)^n * k * Sum_{j=1..n} (-n+j+k)^(j-1) * binomial(n,j) * b(n-j,j)
    if (n * k == 0) {
      return n == 0 ? Q.ONE : Q.ZERO;
    }
    Q sum = Q.ZERO;
    for (int j = mJStart; j <= n; ++j) {
      sum = sum.add(get(n - j, mC * j).multiply(Q.valueOf(mA * n + mB * j + k).pow(j - 1)).multiply(Functions.BINOMIAL.z(n, j)));
    }
    return sum.multiply((n & 1) == 0 ? k : mKNeg * k);
  }

  protected Q t(final int n, final int m) {
    return get(n, mTNeg * m);
  }

  @Override
  public Z a(final int n, final int k) {
    return t(n, k).num();
  }

  @Override
  public Z next() {
    if (--mM < 0) {
      ++mN;
      mM = mN;
    }
    return t(mN - mM, mM).num();
  }
}
