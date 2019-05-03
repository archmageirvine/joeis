package irvine.oeis.a221;

import irvine.oeis.LinearRecurrence;

/**
 * A221367 The simple continued fraction expansion of <code>F(x) :=</code> product <code>{n = 0..inf} (1 - x^(4*n+3))/(1 - x^(4*n+1))</code> when <code>x = 1/2*(9 - sqrt(77))</code>.
 * @author Sean A. Irvine
 */
public class A221367 extends LinearRecurrence {

  /** Construct the sequence. */
  public A221367() {
    super(new long[] {1, 0, -10, 0, 10, 0}, new long[] {1, 7, 1, 77, 1, 700});
  }
}
