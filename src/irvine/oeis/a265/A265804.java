package irvine.oeis.a265;

import irvine.oeis.LinearRecurrence;

/**
 * A265804.
 * @author Sean A. Irvine
 */
public class A265804 extends LinearRecurrence {

  /** Construct the sequence. */
  public A265804() {
    super(new long[] {-1, 2, 2}, new long[] {1, 19, 29});
  }
}
