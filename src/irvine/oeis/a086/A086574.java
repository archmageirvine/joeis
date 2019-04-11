package irvine.oeis.a086;

import irvine.oeis.LinearRecurrence;

/**
 * A086574 <code>3*(10^n-1)</code>.
 * @author Sean A. Irvine
 */
public class A086574 extends LinearRecurrence {

  /** Construct the sequence. */
  public A086574() {
    super(new long[] {-10, 11}, new long[] {0, 27});
  }
}
