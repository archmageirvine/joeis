package irvine.oeis.a177;

import irvine.oeis.LinearRecurrence;

/**
 * A177073 <code>(9*n+4)*(9*n+5)</code>.
 * @author Sean A. Irvine
 */
public class A177073 extends LinearRecurrence {

  /** Construct the sequence. */
  public A177073() {
    super(new long[] {1, -3, 3}, new long[] {20, 182, 506});
  }
}
