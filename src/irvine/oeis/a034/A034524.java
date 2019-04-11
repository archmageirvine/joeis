package irvine.oeis.a034;

import irvine.oeis.LinearRecurrence;

/**
 * A034524 <code>11^n + 1</code>.
 * @author Sean A. Irvine
 */
public class A034524 extends LinearRecurrence {

  /** Construct the sequence. */
  public A034524() {
    super(new long[] {-11, 12}, new long[] {2, 12});
  }
}
