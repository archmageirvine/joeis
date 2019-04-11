package irvine.oeis.a080;

import irvine.oeis.LinearRecurrence;

/**
 * A080961 Fourth binomial transform of A010686 (period 2: repeat 1,5).
 * @author Sean A. Irvine
 */
public class A080961 extends LinearRecurrence {

  /** Construct the sequence. */
  public A080961() {
    super(new long[] {-15, 8}, new long[] {1, 9});
  }
}
