package irvine.oeis.a139;

import irvine.oeis.LinearRecurrence;

/**
 * A139697 Binomial transform of <code>[1, 12, 12, 12,</code>...].
 * @author Sean A. Irvine
 */
public class A139697 extends LinearRecurrence {

  /** Construct the sequence. */
  public A139697() {
    super(new long[] {-2, 3}, new long[] {1, 13});
  }
}
