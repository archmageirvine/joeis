package irvine.oeis.a035;

import irvine.oeis.DifferenceSequence;

/**
 * A035425 First differences of A035421.
 * @author Sean A. Irvine
 */
public class A035425 extends DifferenceSequence {

  /** Construct the sequence. */
  public A035425() {
    super(1, new A035421());
  }
}

