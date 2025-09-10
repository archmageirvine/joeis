package irvine.oeis.a035;

import irvine.oeis.DifferenceSequence;

/**
 * A035416 First differences of A035406.
 * @author Sean A. Irvine
 */
public class A035416 extends DifferenceSequence {

  /** Construct the sequence. */
  public A035416() {
    super(1, new A035406());
  }
}

