package irvine.oeis.a008;

import irvine.oeis.CoordinationSequence;

/**
 * A008682 Expansion of <code>1/((1-x^4)(1-x^5)(1-x^6))</code>.
 * @author Sean A. Irvine
 */
public class A008682 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008682() {
    super(new long[] {1}, new int[] {4, 5, 6});
  }
}

