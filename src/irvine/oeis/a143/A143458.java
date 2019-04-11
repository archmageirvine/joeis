package irvine.oeis.a143;

import irvine.oeis.LinearRecurrence;

/**
 * A143458 Expansion of <code>1/(x^k*(1-x-3*x^(k+1)))</code> for <code>k=7</code>.
 * @author Sean A. Irvine
 */
public class A143458 extends LinearRecurrence {

  /** Construct the sequence. */
  public A143458() {
    super(new long[] {3, 0, 0, 0, 0, 0, 0, 1}, new long[] {1, 4, 7, 10, 13, 16, 19, 22});
  }
}
