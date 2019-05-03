package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168673 Binomial transform of <code>A169609</code>.
 * @author Sean A. Irvine
 */
public class A168673 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168673() {
    super(new long[] {2, -3, 3}, new long[] {1, 4, 10});
  }
}
