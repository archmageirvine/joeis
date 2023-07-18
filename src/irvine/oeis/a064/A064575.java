package irvine.oeis.a064;

import irvine.oeis.DifferenceSequence;

/**
 * A064575 First differences of A064572.
 * @author Sean A. Irvine
 */
public class A064575 extends DifferenceSequence {

  /** Construct the sequence. */
  public A064575() {
    super(1, new A064572());
  }
}

