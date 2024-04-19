package irvine.oeis.a328;

import java.util.function.BiFunction;

import irvine.math.z.Z;
import irvine.oeis.memory.FunctionInt3ZSequence;

/**
 * A328429 Number of inversion sequences of length n avoiding the consecutive patterns 012, 101, 102, and 201.
 * @author Georg Fischer
 */
public class A328429 extends FunctionInt3ZSequence {

  private int mN;
  private final int mB2;
  private final BiFunction<Integer, Integer, Integer> mCond1;
  private final BiFunction<Integer, Integer, Integer> mCond2;

  /** Construct the sequence. */
  public A328429() {
    this(0, -1, (x, i) -> (i != x) ? 1 : 0, (x, i) -> (i < x) ? 1 : 0);
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param b2 0 means mN, or-1
   * @param cond1 first condition
   * @param cond2 second condition
   */
  public A328429(final int offset, final int b2, final BiFunction<Integer, Integer, Integer> cond1, final BiFunction<Integer, Integer, Integer> cond2) {
    super(offset);
    mN = offset - 1;
    mB2 = b2;
    mCond1 = cond1;
    mCond2 = cond2;
  }

  /* Maple:
    b := proc(n, x, t) option remember; `if`(n = 0, 1, add(
           `if`(t and i <> x, 0, b(n-1, i, i<x)), i=0 .. n - 1))
         end proc:
    a := n -> b(n, -1, false):
    seq(a(n), n = 0 .. 24);
  */
  @Override
  protected Z compute(final int n, final int x, final int t) {
    if (n == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (int i = 0; i < n; ++i) {
      if (!(t == 1 && mCond1.apply(x, i) == 1)) {
        sum = sum.add(get(n - 1, i, mCond2.apply(x, i)));
      }
    }
    return sum;
  }

  @Override
  public Z next() {
    ++mN;
    return get(mN, (mB2 == 0) ? mN : -1, 0);
  }
}
