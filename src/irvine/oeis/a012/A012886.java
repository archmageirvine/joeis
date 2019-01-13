package irvine.oeis.a012;

import irvine.oeis.LinearRecurrence;

/**
 * A012886.
 * @author Sean A. Irvine
 */
public class A012886 extends LinearRecurrence {

  /** Construct the sequence. */
  public A012886() {
    super(new long[] {1, -4, 5}, new long[] {1, 2, 3});
  }
}
