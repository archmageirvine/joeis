package irvine.oeis.a121;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A121213 7^n-5^n.
 * @author Sean A. Irvine
 */
public class A121213 extends LinearRecurrence {

  /** Construct the sequence. */
  public A121213() {
    super(new long[] {-35, 12}, new long[] {0, 2});
  }
}
