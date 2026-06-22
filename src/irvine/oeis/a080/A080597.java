package irvine.oeis.a080;
// manually seqop at 2023-06-02 22:32

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a036.A036903;

/**
 * A080597 Minimum number of initial terms from the decimal expansion of Pi (A000796) to include every combination of n digits as a substring.
 * @author Georg Fischer
 */
public class A080597 extends AbstractSequence {

  private int mN = 0;
  private final A036903 mSeq = new A036903();

  /** Construct the sequence. */
  public A080597() {
    super(1);
    int bOffset = 0;
    while (bOffset < mN) {
      ++bOffset;
      mSeq.next();
    }
  }

  @Override
  public Z next() {
    ++mN;
    return mSeq.next().add(1);
  }
}
