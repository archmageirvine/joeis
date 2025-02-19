package irvine.oeis.a075;

import irvine.oeis.FilterPositionSequence;

/**
 * A075451 Numbers k such that gcd(A075443(k), A000010(k)) = 1.
 * @author Sean A. Irvine
 */
public class A075451 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A075451() {
    super(1, new A075445(), ONE);
  }
}
