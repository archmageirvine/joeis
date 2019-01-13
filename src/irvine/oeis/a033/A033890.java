package irvine.oeis.a033;

import irvine.oeis.LinearRecurrence;

/**
 * A033890.
 * @author Sean A. Irvine
 */
public class A033890 extends LinearRecurrence {

  /** Construct the sequence. */
  public A033890() {
    super(new long[] {-1, 7}, new long[] {1, 8});
  }
}
