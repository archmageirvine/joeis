package irvine.oeis.a035;

import irvine.oeis.DifferenceSequence;

/**
 * A035426 First differences of A035422.
 * @author Sean A. Irvine
 */
public class A035426 extends DifferenceSequence {

  /** Construct the sequence. */
  public A035426() {
    super(1, new A035422());
  }
}

