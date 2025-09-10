package irvine.oeis.a035;

import irvine.oeis.DifferenceSequence;

/**
 * A035413 First differences of A035403.
 * @author Sean A. Irvine
 */
public class A035413 extends DifferenceSequence {

  /** Construct the sequence. */
  public A035413() {
    super(1, new A035403());
  }
}

