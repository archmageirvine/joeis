package irvine.oeis.a035;

import irvine.oeis.DifferenceSequence;

/**
 * A035428 First differences of A035424.
 * @author Sean A. Irvine
 */
public class A035428 extends DifferenceSequence {

  /** Construct the sequence. */
  public A035428() {
    super(1, new A035424());
  }
}

