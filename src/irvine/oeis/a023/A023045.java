package irvine.oeis.a023;

import irvine.oeis.DifferenceSequence;

/**
 * A023045 8th differences of factorial numbers.
 * @author Sean A. Irvine
 */
public class A023045 extends DifferenceSequence {

  /** Construct the sequence. */
  public A023045() {
    super(new A023044());
  }
}
