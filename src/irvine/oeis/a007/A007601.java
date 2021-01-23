package irvine.oeis.a007;

import irvine.oeis.RecordPositionSequence;

/**
 * A007601 Positions where A007600 increases.
 * @author Sean A. Irvine
 */
public class A007601 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A007601() {
    super(new A007600(), 1);
  }
}
