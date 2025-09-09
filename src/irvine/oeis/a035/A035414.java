package irvine.oeis.a035;

import irvine.oeis.DifferenceSequence;

/**
 * A035414 First differences of A035404.
 * @author Sean A. Irvine
 */
public class A035414 extends DifferenceSequence {

  /** Construct the sequence. */
  public A035414() {
    super(new A035404());
  }
}

