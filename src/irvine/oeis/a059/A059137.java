package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A059137 A hierarchical sequence (W3{2,2}cc - see A059126).
 * @author Sean A. Irvine
 */
public class A059137 extends AbstractSequence {

  private final A059136 mSeq1 = new A059136();

  /** Construct the sequence. */
  public A059137() {
    super(0);
  }

  @Override
  public Z next() {
    return mSeq1.next().add(mSeq1.next()).add(mSeq1.next());
  }
}

