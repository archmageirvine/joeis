package irvine.oeis.a177;

import irvine.oeis.LinearRecurrence;

/**
 * A177107 <code>3*(10^n-7)</code>.
 * @author Sean A. Irvine
 */
public class A177107 extends LinearRecurrence {

  /** Construct the sequence. */
  public A177107() {
    super(new long[] {-10, 11}, new long[] {9, 279});
  }
}
