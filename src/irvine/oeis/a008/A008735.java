package irvine.oeis.a008;

import irvine.oeis.CoordinationSequence;

/**
 * A008735 Molien series for 3-dimensional group <code>[2+,n ] = 2*(n/2)</code>.
 * @author Sean A. Irvine
 */
public class A008735 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008735() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 1}, new int[] {2, 2, 12});
  }
}

