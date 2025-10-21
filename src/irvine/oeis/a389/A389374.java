package irvine.oeis.a389;

import irvine.oeis.SetDifferenceSequence;

/**
 * A389374 Powers k^m, m &gt; 1, where k is an Achilles number that has a primorial kernel but is not a product of primorials.
 * @author Sean A. Irvine
 */
public class A389374 extends SetDifferenceSequence {

  /** Construct the sequence. */
  public A389374() {
    super(1, new A389226(), new A389260());
  }
}
