package irvine.oeis.a077;

import irvine.oeis.LinearRecurrence;

/**
 * A077937.
 * @author Sean A. Irvine
 */
public class A077937 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077937() {
    super(new long[] {-2, 2, 2}, new long[] {1, 2, 6});
  }
}
