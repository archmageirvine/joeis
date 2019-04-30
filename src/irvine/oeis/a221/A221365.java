package irvine.oeis.a221;

import irvine.oeis.LinearRecurrence;

/**
 * A221365 The simple continued fraction expansion of <code>F(x) </code>:= product <code>{n = 0</code>..inf} <code>(1 - x^(4*n+3))/(1 - x^(4*n+1))</code> when <code>x = 1/2*(5 - sqrt(21))</code>.
 * @author Sean A. Irvine
 */
public class A221365 extends LinearRecurrence {

  /** Construct the sequence. */
  public A221365() {
    super(new long[] {1, 0, -6, 0, 6, 0}, new long[] {1, 3, 1, 21, 1, 108});
  }
}
