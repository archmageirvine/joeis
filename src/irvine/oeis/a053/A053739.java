package irvine.oeis.a053;

import irvine.oeis.LinearRecurrence;

/**
 * A053739 Partial sums of A014166.
 * @author Sean A. Irvine
 */
public class A053739 extends LinearRecurrence {

  /** Construct the sequence. */
  public A053739() {
    super(new long[] {-1, 4, -4, -5, 15, -14, 6}, new long[] {1, 6, 22, 63, 155, 344, 709});
  }
}
