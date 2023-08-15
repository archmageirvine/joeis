package irvine.oeis.a363;
// manually robots/lingf at 2023-08-14

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000290;
import irvine.oeis.a001.A001844;

/**
 * A363319 Squares (A000290) and centered squares (A001844) sorted, including duplicates.
 * @author Georg Fischer
 */
public class A363319 extends AbstractSequence {

  private final AbstractSequence mSeqA = new A000290().skip(1); // remove 0
  private final AbstractSequence mSeqB = new A001844();
  private Z mA = mSeqA.next();
  private Z mB = mSeqB.next();

  /** Construct the sequence. */
  public A363319() {
    super(1);
  }

  @Override
  public Z next() {
    Z result = mA;
    if (mA.compareTo(mB) <= 0) {
      mA = mSeqA.next();
    } else {
      result = mB;
      mB = mSeqB.next();
    }
    return result;
  }
}
