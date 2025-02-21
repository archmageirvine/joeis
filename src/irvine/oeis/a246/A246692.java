package irvine.oeis.a246;
// manually 2025-02-19/filter at 2025-02-19 08:50

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000129;

/**
 * A246692 Numbers k such that k | A000129(k).
 * @author Georg Fischer
 */
public class A246692 extends AbstractSequence {

  private final AbstractSequence mSeq = new A000129();
  private int mN = 0;

  /** Construct the sequence. */
  public A246692() {
    super(1);
    mSeq.next(); // skip Pell(0)
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (mSeq.next().mod(mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
