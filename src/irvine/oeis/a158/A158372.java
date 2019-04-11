package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158372 <code>576n - 1</code>.
 * @author Sean A. Irvine
 */
public class A158372 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158372() {
    super(new long[] {-1, 2}, new long[] {575, 1151});
  }
}
