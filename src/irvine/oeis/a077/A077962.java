package irvine.oeis.a077;

import irvine.oeis.LinearRecurrence;

/**
 * A077962.
 * @author Sean A. Irvine
 */
public class A077962 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077962() {
    super(new long[] {-1, -1, 0}, new long[] {1, 0, -1});
  }
}
