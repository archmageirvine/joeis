package irvine.oeis.a084;

import irvine.oeis.DifferenceSequence;

/**
 * A084465 First differences of A084449.
 * @author Sean A. Irvine
 */
public class A084465 extends DifferenceSequence {

  /** Construct the sequence. */
  public A084465() {
    super(new A084449());
  }
}
