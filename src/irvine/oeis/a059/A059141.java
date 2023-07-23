package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A059141 A hierarchical sequence (W2{3}*c - see A059126).
 * @author Sean A. Irvine
 */
public class A059141 extends AbstractSequence {

  private final A059130 mSeq1 = new A059130();

  /** Construct the sequence. */
  public A059141() {
    super(0);
  }

  @Override
  public Z next() {
    return mSeq1.next().add(mSeq1.next()).add(mSeq1.next()).add(mSeq1.next()).add(mSeq1.next()).add(mSeq1.next()).add(mSeq1.next());
  }
}

