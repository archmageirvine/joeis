package irvine.oeis.a005;

import irvine.oeis.RecordPositionSequence;

/**
 * A005520 Smallest number of complexity n: smallest number requiring <code>n 1</code>'s to build using + and <code>*</code>.
 * @author Sean A. Irvine
 */
public class A005520 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A005520() {
    super(new A005245(), 1);
  }
}
