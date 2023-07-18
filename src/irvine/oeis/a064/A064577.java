package irvine.oeis.a064;

import irvine.oeis.DifferenceSequence;

/**
 * A064577 First differences of A064574.
 * @author Sean A. Irvine
 */
public class A064577 extends DifferenceSequence {

  /** Construct the sequence. */
  public A064577() {
    super(1, new A064574());
  }
}

