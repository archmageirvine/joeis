package irvine.oeis.a089;

import irvine.oeis.LinearRecurrence;

/**
 * A089508 Solution to a binomial problem together with companion sequence <code>A081016(n-1)</code>.
 * @author Sean A. Irvine
 */
public class A089508 extends LinearRecurrence {

  /** Construct the sequence. */
  public A089508() {
    super(new long[] {1, -8, 8}, new long[] {1, 14, 103});
  }
}
