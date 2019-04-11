package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158371 <code>576n^2 - 2n</code>.
 * @author Sean A. Irvine
 */
public class A158371 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158371() {
    super(new long[] {1, -3, 3}, new long[] {574, 2300, 5178});
  }
}
