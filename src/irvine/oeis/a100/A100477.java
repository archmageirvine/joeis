package irvine.oeis.a100;

import irvine.oeis.LinearRecurrence;

/**
 * A100477 <code>a(n) = 3*a(n-1)+2*a(n-2)+a(n-3)</code> if <code>n&gt;=3</code> else <code>a(n) = n</code>.
 * @author Sean A. Irvine
 */
public class A100477 extends LinearRecurrence {

  /** Construct the sequence. */
  public A100477() {
    super(new long[] {1, 2, 3}, new long[] {0, 1, 2});
  }
}
