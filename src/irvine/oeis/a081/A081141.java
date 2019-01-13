package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081141.
 * @author Sean A. Irvine
 */
public class A081141 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081141() {
    super(new long[] {1331, -363, 33}, new long[] {0, 0, 1});
  }
}
