package irvine.oeis.a033;

import irvine.oeis.LinearRecurrence;

/**
 * A033114.
 * @author Sean A. Irvine
 */
public class A033114 extends LinearRecurrence {

  /** Construct the sequence. */
  public A033114() {
    super(new long[] {-4, 1, 4}, new long[] {1, 4, 17});
  }
}
