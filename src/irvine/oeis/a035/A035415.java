package irvine.oeis.a035;

import irvine.oeis.DifferenceSequence;

/**
 * A035415 First differences of A035405.
 * @author Sean A. Irvine
 */
public class A035415 extends DifferenceSequence {

  /** Construct the sequence. */
  public A035415() {
    super(1, new A035405());
  }
}

