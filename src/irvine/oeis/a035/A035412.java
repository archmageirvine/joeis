package irvine.oeis.a035;

import irvine.oeis.DifferenceSequence;

/**
 * A035412 First differences of A035402.
 * @author Sean A. Irvine
 */
public class A035412 extends DifferenceSequence {

  /** Construct the sequence. */
  public A035412() {
    super(1, new A035402());
  }
}

