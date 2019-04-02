package irvine.oeis.a005;

import irvine.oeis.RecordPositionSequence;

/**
 * A005520 Smallest number of complexity n: smallest number requiring n 1's to build using + and *.
 * @author Sean A. Irvine
 */
public class A005520 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A005520() {
    super(new A005245(), 1);
  }
}
