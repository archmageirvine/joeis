package irvine.oeis.a033;

import irvine.oeis.LinearRecurrence;

/**
 * A033122.
 * @author Sean A. Irvine
 */
public class A033122 extends LinearRecurrence {

  /** Construct the sequence. */
  public A033122() {
    super(new long[] {-4, 1, 0, 4}, new long[] {1, 4, 17, 69});
  }
}
