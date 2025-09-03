package irvine.oeis.a035;

import irvine.oeis.DifferenceSequence;

/**
 * A035413 The first differences of A035403.
 * @author Sean A. Irvine
 */
public class A035413 extends DifferenceSequence {

  /** Construct the sequence. */
  public A035413() {
    super(new A035403());
  }
}

