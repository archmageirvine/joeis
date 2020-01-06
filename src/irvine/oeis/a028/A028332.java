package irvine.oeis.a028;

import irvine.oeis.DistinctSequence;

/**
 * A028332 Distinct elements to the right of the central elements of the even-Pascal triangle <code>A028326</code>.
 * @author Sean A. Irvine
 */
public class A028332 extends DistinctSequence {

  /** Construct the sequence. */
  public A028332() {
    super(new A028330());
  }
}
