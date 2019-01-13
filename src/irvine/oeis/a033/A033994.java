package irvine.oeis.a033;

import irvine.oeis.LinearRecurrence;

/**
 * A033994.
 * @author Sean A. Irvine
 */
public class A033994 extends LinearRecurrence {

  /** Construct the sequence. */
  public A033994() {
    super(new long[] {-1, 4, -6, 4}, new long[] {2, 11, 32, 70});
  }
}
