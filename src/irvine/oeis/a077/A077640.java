package irvine.oeis.a077;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A077640 Smallest term of a run of at least 7 consecutive integers which are not squarefree.
 * @author Sean A. Irvine
 */
public class A077640 extends Sequence1 {

  private final int mChainLength;
  private long mN;

  protected A077640(final int chainLength, final long firstTerm) {
    mChainLength = chainLength;
    mN = firstTerm - 1;
  }

  /** Construct the sequence. */
  public A077640() {
    this(7, 217070);
  }

  private boolean is(final long n) {
    for (int k = 0; k < mChainLength; ++k) {
      if (Functions.MOBIUS.i(n + k) != 0) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      if (is(++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
