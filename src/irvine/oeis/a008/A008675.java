package irvine.oeis.a008;

import irvine.oeis.CoordinationSequence;

/**
 * A008675 Expansion of 1/( Product_{j=0..5} (1-x^(2*j+1)) ).
 * @author Sean A. Irvine
 */
public class A008675 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008675() {
    super(new long[] {1}, new int[] {1, 3, 5, 7, 9, 11});
  }
}

