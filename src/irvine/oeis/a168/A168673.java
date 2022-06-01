package irvine.oeis.a168;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A168673 Binomial transform of A169609.
 * @author Sean A. Irvine
 */
public class A168673 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168673() {
    super(new long[] {2, -3, 3}, new long[] {1, 4, 10});
  }
}
