package irvine.oeis.a226;

import irvine.oeis.LinearRecurrence;

/**
 * A226122.
 * @author Sean A. Irvine
 */
public class A226122 extends LinearRecurrence {

  /** Construct the sequence. */
  public A226122() {
    super(new long[] {-1, 0, 0, 2, 0, 0}, new long[] {1, 2, 1, 3, 6, 3});
  }
}
