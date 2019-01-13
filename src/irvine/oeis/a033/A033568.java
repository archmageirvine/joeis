package irvine.oeis.a033;

import irvine.oeis.LinearRecurrence;

/**
 * A033568.
 * @author Sean A. Irvine
 */
public class A033568 extends LinearRecurrence {

  /** Construct the sequence. */
  public A033568() {
    super(new long[] {1, -3, 3}, new long[] {1, 2, 15});
  }
}
