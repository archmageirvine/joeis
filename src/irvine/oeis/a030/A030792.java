package irvine.oeis.a030;

import irvine.oeis.RecordPositionSequence;

/**
 * A030792 Positions of record values in <code>A030787</code>.
 * @author Sean A. Irvine
 */
public class A030792 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A030792() {
    super(new A030787(), 1);
  }
}
