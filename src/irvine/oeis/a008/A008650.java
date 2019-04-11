package irvine.oeis.a008;

import irvine.oeis.CoordinationSequence;

/**
 * A008650 Molien series of 4 X 4 upper triangular matrices over GF( <code>3 )</code>.
 * @author Sean A. Irvine
 */
public class A008650 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008650() {
    super(new long[] {1}, new int[] {1, 3, 9, 27});
  }
}

