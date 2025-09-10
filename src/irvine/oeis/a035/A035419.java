package irvine.oeis.a035;

import irvine.oeis.DifferenceSequence;

/**
 * A035419 First differences of A035409.
 * @author Sean A. Irvine
 */
public class A035419 extends DifferenceSequence {

  /** Construct the sequence. */
  public A035419() {
    super(1, new A035409());
  }
}

