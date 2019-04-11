package irvine.oeis.a008;

import irvine.oeis.CoordinationSequence;

/**
 * A008675 Expansion of <code>1/((1-x)(1-x^3)(1-x^5) </code>... <code>(1-x^11))</code>.
 * @author Sean A. Irvine
 */
public class A008675 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008675() {
    super(new long[] {1}, new int[] {1, 3, 5, 7, 9, 11});
  }
}

