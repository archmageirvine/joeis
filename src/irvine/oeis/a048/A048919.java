package irvine.oeis.a048;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A048919 Indices of 9-gonal numbers which are also heptagonal.
 * @author Sean A. Irvine
 */
public class A048919 extends LinearRecurrence {

  /** Construct the sequence. */
  public A048919() {
    super(new long[] {1, -143, 143}, new long[] {1, 88, 12445});
  }
}
