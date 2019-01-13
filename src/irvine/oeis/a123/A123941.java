package irvine.oeis.a123;

import irvine.oeis.LinearRecurrence;

/**
 * A123941.
 * @author Sean A. Irvine
 */
public class A123941 extends LinearRecurrence {

  /** Construct the sequence. */
  public A123941() {
    super(new long[] {-1, 0, 3}, new long[] {0, 1, 3});
  }
}
