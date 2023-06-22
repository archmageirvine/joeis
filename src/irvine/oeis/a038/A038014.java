package irvine.oeis.a038;

import irvine.oeis.DifferenceSequence;

/**
 * A038014 Differences of A038013.
 * @author Sean A. Irvine
 */
public class A038014 extends DifferenceSequence {

  /** Construct the sequence. */
  public A038014() {
    super(1, new A038013());
  }
}
