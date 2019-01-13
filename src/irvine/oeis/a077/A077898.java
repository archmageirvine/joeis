package irvine.oeis.a077;

import irvine.oeis.LinearRecurrence;

/**
 * A077898.
 * @author Sean A. Irvine
 */
public class A077898 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077898() {
    super(new long[] {-2, 3, 0}, new long[] {1, 0, 3});
  }
}
