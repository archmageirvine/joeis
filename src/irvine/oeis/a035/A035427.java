package irvine.oeis.a035;

import irvine.oeis.DifferenceSequence;

/**
 * A035427 First differences of A035423.
 * @author Sean A. Irvine
 */
public class A035427 extends DifferenceSequence {

  /** Construct the sequence. */
  public A035427() {
    super(new A035423());
  }
}

