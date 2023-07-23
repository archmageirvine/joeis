package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A059143 A hierarchical sequence (W3{2,2}*c - see A059126).
 * @author Sean A. Irvine
 */
public class A059143 extends AbstractSequence {

  private final A059131 mSeq1 = new A059131();

  /** Construct the sequence. */
  public A059143() {
    super(0);
  }

  @Override
  public Z next() {
    return mSeq1.next().add(mSeq1.next()).add(mSeq1.next());
  }
}

