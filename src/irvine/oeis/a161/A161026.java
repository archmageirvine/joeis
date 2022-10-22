package irvine.oeis.a161;

import java.util.function.Function;

import irvine.math.MemoryFunction1;
import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Fibonacci;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A161026 Number of partitions of n into Fibonacci numbers where every part appears at least 2 times.
 * @author Georg Fischer
 */
public class A161026 extends AbstractSequence {

  private final int mAppears; // every part appears at least this many times.
  private int mN; // index of next term
  private final int mParm2; // second parameter of recursive function
  protected Function<Integer, Integer> mLambda;

  /** Construct with default parameters. */
  public A161026() {
    this(0, 2);
  }

  /**
   * Generic constructor with default recursion.
   * @param offset first index
   * @param appears how often every part appears
   */
  public A161026(final int offset, final int appears) {
    this(offset, appears, 2, n -> Fibonacci.fibonacci(n).intValue());
  }

  /**
   * Generic constructor with parameters.
   * @param offset first index
   * @param appears how often every part appears
   * @param parm2 second parameter of recursive function
   */
  public A161026(final int offset, final int appears, final int parm2, final Function<Integer, Integer> lambda) {
    super(offset);
    mAppears = appears;
    mParm2 = parm2;
    mN = offset - 1;
    mLambda = lambda;
  }

  /* # Maple program (from A161026):
    F:= proc(n) option remember; (<<0|1>, <1|1>>^n)[1, 2] end:
    b:= proc(n, i) option remember; `if`(n=0, 1, (f-> `if`(2*f<=n,
      add(b(n-j*f, i+1), j=[0, $2..n/f]), 0))(F(i)))
    end:
    a:= n-> b(n, 2):
    seq(a(n), n=0..80);
  */
  private MemoryFunction1<Integer> mF = new MemoryFunction1<Integer>() {
    @Override
    protected Integer compute(final int n) {
      return mLambda.apply(n);
    }
  };

  protected MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<Z>() {
    @Override
    protected Z compute(final int n, final int i) {
      if (n == 0) {
        return Z.ONE;
      }
      Z sum = Z.ZERO;
      final int f = mF.get(i);
      if (f * mAppears <= n) {
        sum = get(n, i + 1); // j = 0
        final int jmax = n / f;
        for (int j = mAppears; j <= jmax; ++j) {
          sum = sum.add(get(n - j * f, i + 1));
        }
      }
      return sum;
    }
  };

  @Override
  public Z next() {
    ++mN;
    return mB.get(mN, mParm2);
  }
}
