package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A059144 A hierarchical sequence (W3{2,2}*cc - see A059126).
 * @author Sean A. Irvine
 */
public class A059144 extends AbstractSequence {

  private final A059143 mSeq1 = new A059143();

  /** Construct the sequence. */
  public A059144() {
    super(0);
  }

  @Override
  public Z next() {
    return mSeq1.next().add(mSeq1.next()).add(mSeq1.next());
  }
}

