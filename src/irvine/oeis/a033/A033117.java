package irvine.oeis.a033;

import irvine.oeis.LinearRecurrence;

/**
 * A033117.
 * @author Sean A. Irvine
 */
public class A033117 extends LinearRecurrence {

  /** Construct the sequence. */
  public A033117() {
    super(new long[] {-7, 1, 7}, new long[] {1, 7, 50});
  }
}
