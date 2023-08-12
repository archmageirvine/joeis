package irvine.oeis.a065;

import irvine.oeis.DifferenceSequence;

/**
 * A065067 First differences of A065027.
 * @author Sean A. Irvine
 */
public class A065067 extends DifferenceSequence {

  /** Construct the sequence. */
  public A065067() {
    super(0, new A065027());
  }
}

