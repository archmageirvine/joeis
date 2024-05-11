package irvine.oeis.a194;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A194161 a(n) = [Sum_{k=1..n} (k*r)], where [ ]=floor, ( )=fractional part, and r=sqrt(2).
 * @author Georg Fischer
 */
public class A194161 extends AbstractSequence {

  private int mN; // current index
  private CR mR; // real value
  private CR mSum; // previous sum

  /** Construct the sequence. */
  public A194161() {
    this(1, CR.TWO.sqrt());
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param r real value
   */
  public A194161(final int offset, final CR r) {
    super(offset);
    mN = 0;
    mR = r;
    mSum = CR.ZERO;
  }

  @Override
  public Z next() {
    ++mN;
    mSum = mSum.add(mR.multiply(mN).frac());
    return mSum.floor();
  }
}
