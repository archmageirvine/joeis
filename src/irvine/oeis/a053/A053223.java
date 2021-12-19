package irvine.oeis.a053;

import irvine.oeis.DifferenceSequence;

/**
 * A053223 Second differences of sigma(n).
 * @author Sean A. Irvine
 */
public class A053223 extends DifferenceSequence {

  /** Construct the sequence. */
  public A053223() {
    super(new A053222());
  }
}
