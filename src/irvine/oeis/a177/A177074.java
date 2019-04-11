package irvine.oeis.a177;

import irvine.oeis.LinearRecurrence;

/**
 * A177074 <code>3*(10^n-5)</code>.
 * @author Sean A. Irvine
 */
public class A177074 extends LinearRecurrence {

  /** Construct the sequence. */
  public A177074() {
    super(new long[] {-10, 11}, new long[] {15, 285});
  }
}
