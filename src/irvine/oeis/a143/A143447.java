package irvine.oeis.a143;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A143447 Expansion of 1/(x^k*(1-x-2*x^(k+1))) for k=4.
 * @author Sean A. Irvine
 */
public class A143447 extends LinearRecurrence {

  /** Construct the sequence. */
  public A143447() {
    super(new long[] {2, 0, 0, 0, 1}, new long[] {1, 3, 5, 7, 9});
  }
}
