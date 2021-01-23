package irvine.oeis.a035;
// manually like A035537 2020-09-12

import irvine.math.MemoryFunctionInt2Array;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A035536 Number of partitions of n with equal number of parts congruent to each of 1 and 2 (mod 3).
 * @author Georg Fischer
 */
public class A035536 extends MemoryFunctionInt2Array<Z> implements Sequence {

  protected final int mKMod; // take i mod this number
  protected final int mMult; // multiply mN by this factor
  protected int mN; // index of next term
  protected int mLen; // number of additional variables
  protected final int[] mModules; // which combination of elements to select
  protected final int[] mZeroes; // same length as mModules

  /** Construct with default parameters. */
  public A035536() {
    this(0, 3, 1, new int[] {1, 2});
  }

  /**
   * Construct the sequence.
   * @param offset index of first term
   * @param kMod take i mod this number
   * @param mult multiply n by this factor
   * @param modules vector of valid values
   */
  public A035536(final int offset, final int kMod, final int mult, final int[] modules) {
    mKMod = kMod;
    mLen = modules.length;
    if (mLen == 0) {
      mLen = kMod;
    }
    mMult = mult;
    mZeroes = new int[mLen];
    mModules = new int[mLen];
    for (int ic = 0; ic < mLen; ++ic) {
      mZeroes[ic] = 0;
      mModules[ic] = modules.length == 0 ? ic : modules[ic];
    }
    mN = offset - 1;
  }

  /**
   * Construct the sequence.
   * @param offset index of first term
   * @param kMod take i mod this number
   * @param mult multiply n by this factor
   */
  public A035536(final int offset, final int kMod, final int mult) {
    this(offset, kMod, mult, new int[0]);
  }

  /**
   * Construct the sequence.
   * @param offset index of first term
   * @param kMod take i mod this number
   */
  public A035536(final int offset, final int kMod) {
    this(offset, kMod, 1, new int[0]);
  }

  /**
   * Recursively evaluate all partitions and accumulate information for the condition
   * @param n number to be partitioned
   * @param i nesting level
   * @param cn accumulators
   * @return number of partitions of n with this condition
   */
  @Override
  protected Z compute(final int n, final int i, final int[] cn) {
    final Z result;
    if (n == 0) {
      result = total(cn);
    } else {
      if (i < 1) {
        result = Z.ZERO;
      } else {
        final int ni = n - i;
        final int kMod = i % mKMod;
        final int[] cnew = new int[mLen];
        for (int ic = 0; ic < mLen; ++ic) {
            cnew[ic] = cn[ic];
            if (kMod == mModules[ic]) {
              ++cnew[ic];
            }
        }
        result = get(n, i - 1, cn).add(get(ni, Math.min(ni, i), cnew));
      }
    }
    return result;
  }

  /**
   * Returns the resulting number of partitions computed by the recursive method.
   * @param cn array of the additional parameters of the recursive method {@link #compute}.
   * @return number of partitions
   */
  protected Z total(final int[] cn) {
    return (cn[0] == cn[1] && cn[0] >= 0) ? Z.ONE : Z.ZERO;
  }

  /**
   * Compute the next term of the sequence
   * @return a specific number of partitions
   */
  @Override
  public Z next() {
    ++mN;
    return get(mN * mMult, mN * mMult, mZeroes);
  }
}
