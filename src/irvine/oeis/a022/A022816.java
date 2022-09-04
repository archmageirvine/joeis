package irvine.oeis.a022;

import irvine.oeis.recur.CoordinationSequence;

/**
 * A022816 Number of terms in 6th derivative of a function composed with itself n times.
 * @author Sean A. Irvine
 */
public class A022816 extends CoordinationSequence {

  /** Construct the sequence. */
  public A022816() {
    super(new long[] {1, 5, -7, 2}, new int[] {1, 1, 1, 1, 1, 1});
  }

  @Override
  public int getOffset() {
    return 1;
  }
}
