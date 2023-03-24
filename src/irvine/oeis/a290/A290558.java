package irvine.oeis.a290;
// manually simple3 at 2023-03-23 22:27

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a051.A051277;

/**
 * A290558 Coefficients in 7-adic expansion of sqrt(2).
 * @author Georg Fischer
 */
public class A290558 extends AbstractSequence {

  private int mN = -1;
  private final A051277 mSeq = new A051277();

  /** Construct the sequence. */
  public A290558() {
    super(0);
  }

  @Override
  public Z next() {
    ++mN;
    return ((mN == 0) ? Z.SEVEN : Z.SIX).subtract(mSeq.next());
  }
}
