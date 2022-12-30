package irvine.oeis.a114;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a006.A006882;

/**
 * A114853 a(n) = floor(n^n/n!!).
 * @author Georg Fischer
 */
public class A114853 extends Sequence1 {

  private int mN;
  private final CR mDiv;
  private final Sequence mSeq;

  /** Construct the sequence. */
  public A114853() {
    this(new A006882(), 1);
  }

  /**
   * Generic constructor with parameters
   * @param sect sequence for some factorial (2 = double, 3 = !!!)
   * @param div dividend for n
   */
  public A114853(final Sequence seq, final int div) {
    mN = 0;
    mSeq = seq;
    mDiv = CR.valueOf(div);
    mSeq.next(); // skip b(0)
  }

  @Override
  public Z next() {
    ++mN;
    final CR n = CR.valueOf(mN);
    return n.pow(n.divide(mDiv)).round().divide(mSeq.next());
  }
}
