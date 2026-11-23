package irvine.oeis.a361;

import irvine.math.BinaryLambdaCensus;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A361211 Busy Beaver for self-delimiting Binary Lambda Calculus programs.
 * @author Gregory Morse
 */
public class A361211 extends Sequence1 {

  private final boolean mCache;
  private final BinaryLambdaCensus.InputSearch mSearch = new BinaryLambdaCensus.InputSearch();
  private int mN;

  /** Construct the standard iterator. */
  public A361211() {
    this(true);
  }

  /**
   * Construct an iterator with optional caching of the verified slow term.
   * @param cache use the independently verified size-32 result
   */
  public A361211(final boolean cache) {
    mCache = cache;
  }

  @Override
  public Z next() {
    if (++mN > 32) {
      throw new UnsupportedOperationException("Only the published BLC input sizes are supported");
    }
    if (mCache && mN == 32) {
      // Regenerate with BinaryLambdaCensus --strict-bb2 32 30000.
      return Z.valueOf(160);
    }
    return Z.valueOf(mSearch.nextMaximum());
  }
}
