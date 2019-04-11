package irvine.oeis.a028;

import irvine.oeis.LinearRecurrence;

/**
 * A028399 <code>a(n) = 2^n - 4</code>.
 * @author Sean A. Irvine
 */
public class A028399 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028399() {
    super(new long[] {-2, 3}, new long[] {0, 4});
  }
}
