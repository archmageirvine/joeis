package irvine.oeis.a272;

import irvine.oeis.LinearRecurrence;

/**
 * A272379.
 * @author Sean A. Irvine
 */
public class A272379 extends LinearRecurrence {

  /** Construct the sequence. */
  public A272379() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 1, 86, 759, 3100});
  }
}
