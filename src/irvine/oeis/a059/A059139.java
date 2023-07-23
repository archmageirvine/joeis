package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A059139 A hierarchical sequence (W2{2}*c - see A059126).
 * @author Sean A. Irvine
 */
public class A059139 extends AbstractSequence {

  private final A059129 mSeq1 = new A059129();

  /** Construct the sequence. */
  public A059139() {
    super(0);
  }

  @Override
  public Z next() {
    return mSeq1.next().add(mSeq1.next()).add(mSeq1.next());
  }
}

