package irvine.oeis.a165;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A165133 a(n) = (2^(n+4)-1)*(2^n+1).
 * @author Sean A. Irvine
 */
public class A165133 extends LinearRecurrence {

  /** Construct the sequence. */
  public A165133() {
    super(new long[] {8, -14, 7}, new long[] {30, 93, 315});
  }
}
