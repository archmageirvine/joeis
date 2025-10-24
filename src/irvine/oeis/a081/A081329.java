package irvine.oeis.a081;

import irvine.oeis.FilterPositionSequence;

/**
 * A081329 Numbers having no representation as sum of two 3-smooth numbers.
 * @author Sean A. Irvine
 */
public class A081329 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A081329() {
    super(1, new A081327(), ZERO);
  }
}

