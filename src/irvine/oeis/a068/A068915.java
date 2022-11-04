package irvine.oeis.a068;

import java.util.function.Function;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A068915 a(n) = n if n&lt;2; a(n) = |a(n/2)-a(n/2-1)| if n is even, and a(n) = a((n-1)/2) + a((n-1)/2+1) if n is odd.
 * @author Georg Fischer
 */
public class A068915 extends MemorySequence {

  protected int mModul;
  protected int mOffset;
  protected Function<Integer, Z> mFuncT;
  protected Function<Integer, Z> mFuncF;
  protected int[] mInits;
  protected int mILen; // length of mInits

  /** Construct the sequence. */
  public A068915() {
    this(0, 2, 0, 1);
  }

  /**
   * Generic constructor with parameters
   * @param offset index of first term
   * @param modul 2 or 3
   * @param inits list of initial terms
   */
  public A068915(final int offset, final int modul, final int... inits) {
    mModul = modul;
    mOffset = offset;
    mInits = inits;
    if (offset > 0) {
      add(null);
    }
    mILen = mInits.length;
    initialize();
  }

  /**
   * Circumvent the restriction that <code>a(n)</code> cannot be used in the constructor.
   */
  protected void initialize() {
    mFuncF = n -> a((n - 1) / 2).add(super.a((n - 1) / 2 + 1));
    mFuncT = n -> a(n / 2).subtract(super.a(n / 2 - 1)).abs();
  }

  @Override
  public Z computeNext() {
    final int n = size();
    if (n - mOffset < mILen) {
      return Z.valueOf(mInits[n - mOffset]);
    }
    return (mModul == 0 || n % mModul != 0) ? mFuncF.apply(n) : mFuncT.apply(n);
  }
}
