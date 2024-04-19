package irvine.oeis.a329;
// manually anopsn 0,0

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000931;

/**
 * A329227 Products of consecutive terms of the Padovan sequence A000931.
 * @author Georg Fischer
 */
public class A329227 extends AbstractSequence {

  private final A000931 mSeq1 = new A000931();
  private Z mA;

  /** Construct the sequence. */
  public A329227() {
    super(0);
    mA = mSeq1.next();
  }

  @Override
  public Z next() {
    final Z b = mSeq1.next();
    final Z result = b.multiply(mA);
    mA = b;
    return result;
  }
}
