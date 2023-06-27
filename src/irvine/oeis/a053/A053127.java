package irvine.oeis.a053;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A053127 Binomial coefficients C(2*n-4,5).
 * @author Sean A. Irvine
 */
public class A053127 extends LinearRecurrence {

  /** Construct the sequence. */
  public A053127() {
    super(5, new long[] {-1, 6, -15, 20, -15, 6}, new long[] {6, 56, 252, 792, 2002, 4368});
  }
}
