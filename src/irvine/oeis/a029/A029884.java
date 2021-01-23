package irvine.oeis.a029;

import irvine.oeis.DifferenceSequence;

/**
 * A029884 Second differences of Thue-Morse sequence A001285.
 * @author Sean A. Irvine
 */
public class A029884 extends DifferenceSequence {

  /** Construct the sequence. */
  public A029884() {
    super(new A029883());
  }
}
