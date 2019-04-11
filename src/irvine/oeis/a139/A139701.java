package irvine.oeis.a139;

import irvine.oeis.LinearRecurrence;

/**
 * A139701 Binomial transform of <code>[1, 100, 100, 100, </code>...].
 * @author Sean A. Irvine
 */
public class A139701 extends LinearRecurrence {

  /** Construct the sequence. */
  public A139701() {
    super(new long[] {-2, 3}, new long[] {1, 101});
  }
}
