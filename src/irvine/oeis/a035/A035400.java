package irvine.oeis.a035;

import irvine.oeis.DifferenceSequence;

/**
 * A035400 Differences of A035399.
 * @author Sean A. Irvine
 */
public class A035400 extends DifferenceSequence {

  /** Construct the sequence. */
  public A035400() {
    super(1, new A035399());
  }
}

