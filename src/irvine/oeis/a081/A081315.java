package irvine.oeis.a081;

import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A081315 Lexicographically earliest sequence of positive integers such that n occurs a(n)-1 times, starting at n=0.
 * @author Sean A. Irvine
 */
public class A081315 extends CachedSequence {

  private static final long[] SMALL = {1, 2, 3, 2, 4};
  private long mM = 4;
  private int mK = 4;
  private int mC = 2;

  /** Construct the sequence. */
  public A081315() {
    super(0);
  }

  @Override
  protected Z compute(final Z nn) {
    final int n = nn.intValueExact();
    if (n < SMALL.length) {
      return Z.valueOf(SMALL[n]);
    }
    if (--mC < 0) {
      ++mM;
      mC = a(++mK).intValueExact() - 2;
    }
    return Z.valueOf(mM);
  }
}

