package irvine.oeis.a100;

import irvine.oeis.LinearRecurrence;

/**
 * A100606 <code>a(n) = n^4 + n^3 + n</code>.
 * @author Sean A. Irvine
 */
public class A100606 extends LinearRecurrence {

  /** Construct the sequence. */
  public A100606() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 3, 26, 111, 324});
  }
}
