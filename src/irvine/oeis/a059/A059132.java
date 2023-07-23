package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A059132 A hierarchical sequence (W2{2}c - see A059126).
 * @author Sean A. Irvine
 */
public class A059132 extends AbstractSequence {

  private final A059126 mSeq1 = new A059126();

  /** Construct the sequence. */
  public A059132() {
    super(0);
  }

  @Override
  public Z next() {
    return mSeq1.next().add(mSeq1.next()).add(mSeq1.next());
  }
}

