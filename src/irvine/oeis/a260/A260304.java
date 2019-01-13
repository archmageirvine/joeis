package irvine.oeis.a260;

import irvine.oeis.LinearRecurrence;

/**
 * A260304.
 * @author Sean A. Irvine
 */
public class A260304 extends LinearRecurrence {

  /** Construct the sequence. */
  public A260304() {
    super(new long[] {-5, 5}, new long[] {2, 3});
  }
}
