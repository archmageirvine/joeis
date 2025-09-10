package irvine.oeis.a035;

import irvine.oeis.DifferenceSequence;

/**
 * A035411 First differences of A035401.
 * @author Sean A. Irvine
 */
public class A035411 extends DifferenceSequence {

  /** Construct the sequence. */
  public A035411() {
    super(1, new A035401());
  }
}

