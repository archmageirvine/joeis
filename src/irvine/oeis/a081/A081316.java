package irvine.oeis.a081;

import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A081316 Lexicographically earliest sequence of positive integers such that n occurs a(n)-1 times, starting at n=1.
 * @author Sean A. Irvine
 */
public class A081316 extends CachedSequence {

  private static final long[] SMALL = {2, 3, 2, 1, 5};
  private long mM = 5;
  private int mK = 5;
  private int mC = 3;

  /** Construct the sequence. */
  public A081316() {
    super(1);
  }

  @Override
  protected Z compute(final Z nn) {
    final int n = nn.intValueExact();
    if (n <= SMALL.length) {
      return Z.valueOf(SMALL[n - 1]);
    }
    if (--mC < 0) {
      ++mM;
      mC = a(++mK).intValueExact() - 2;
    }
    return Z.valueOf(mM);
  }
}

