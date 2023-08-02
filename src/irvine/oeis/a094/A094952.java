package irvine.oeis.a094;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a005.A005449;

/**
 * A094952 A sequence derived from pentagonal numbers, or a Stirling number of the first kind matrix.
 * @author Georg Fischer
 */
public class A094952 extends Sequence1 {

  private int mN = 0;
  private final A005449 mSeq = new A005449();

  /** Construct the sequence. */
  public A094952() {
    mSeq.next();
  }

  @Override
  public Z next() {
    ++mN;
    return mSeq.next().multiply(2L * mN + 1);
  }
}
