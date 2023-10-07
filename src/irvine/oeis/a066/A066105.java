package irvine.oeis.a066;

import irvine.oeis.RecordPositionSequence;

/**
 * A066105 Indices of the maximum increasing subsequences of A066848 and A066849.
 * @author Sean A. Irvine
 */
public class A066105 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A066105() {
    super(0, new A066848(), 1);
  }
}
