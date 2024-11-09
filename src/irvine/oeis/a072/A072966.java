package irvine.oeis.a072;

import irvine.oeis.FilterPositionSequence;

/**
 * A072966 Numbers which are not the sum of two semiprimes.
 * @author Sean A. Irvine
 */
public class A072966 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A072966() {
    super(1, 0, new A072931(), ZERO);
  }
}

