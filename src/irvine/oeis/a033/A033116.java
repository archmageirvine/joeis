package irvine.oeis.a033;

import irvine.oeis.LinearRecurrence;

/**
 * A033116.
 * @author Sean A. Irvine
 */
public class A033116 extends LinearRecurrence {

  /** Construct the sequence. */
  public A033116() {
    super(new long[] {-6, 1, 6}, new long[] {1, 6, 37});
  }
}
