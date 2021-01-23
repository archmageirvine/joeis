package irvine.oeis.a102;

import irvine.oeis.LinearRecurrence;

/**
 * A102301 a(n) = ((3*n + 1)*2^(n+3) + 9 + (-1)^n)/18.
 * @author Sean A. Irvine
 */
public class A102301 extends LinearRecurrence {

  /** Construct the sequence. */
  public A102301() {
    super(new long[] {4, -4, -3, 4}, new long[] {1, 4, 13, 36});
  }
}
