package irvine.oeis.a057;

import irvine.oeis.DifferenceSequence;

/**
 * A057031 Sequence of differences of A057030.
 * @author Sean A. Irvine
 */
public class A057031 extends DifferenceSequence {

  /** Construct the sequence. */
  public A057031() {
    super(new A057030());
  }
}
