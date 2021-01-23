package irvine.oeis.a100;

import irvine.oeis.LinearRecurrence;

/**
 * A100477 a(n) = 3*a(n-1)+2*a(n-2)+a(n-3) if n&gt;=3 else a(n) = n.
 * @author Sean A. Irvine
 */
public class A100477 extends LinearRecurrence {

  /** Construct the sequence. */
  public A100477() {
    super(new long[] {1, 2, 3}, new long[] {0, 1, 2});
  }
}
