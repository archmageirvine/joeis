package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000682;

/**
 * A060206 Number of rotationally symmetric closed meanders of length 4n+2.
 * @author Sean A. Irvine
 */
public class A060206 extends AbstractSequence {

  private final A000682 mSeq1 = new A000682();

  /** Construct the sequence. */
  public A060206() {
    super(0);
  }

  @Override
  public Z next() {
    final Z t = mSeq1.next();
    mSeq1.next();
    return t;
  }
}
