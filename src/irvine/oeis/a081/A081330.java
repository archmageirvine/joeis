package irvine.oeis.a081;

import irvine.oeis.FilterPositionSequence;

/**
 * A081330 Numbers that can be written as sum of two 3-smooth numbers.
 * @author Sean A. Irvine
 */
public class A081330 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A081330() {
    super(1, new A081327(), NONZERO);
  }
}

