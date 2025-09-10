package irvine.oeis.a035;

import irvine.oeis.DifferenceSequence;

/**
 * A035420 First differences of A035410.
 * @author Sean A. Irvine
 */
public class A035420 extends DifferenceSequence {

  /** Construct the sequence. */
  public A035420() {
    super(1, new A035410());
  }
}

