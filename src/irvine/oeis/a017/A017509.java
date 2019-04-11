package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017509 <code>a(n) = 11*n + 10</code>.
 * @author Sean A. Irvine
 */
public class A017509 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017509() {
    super(new long[] {-1, 2}, new long[] {10, 21});
  }
}
