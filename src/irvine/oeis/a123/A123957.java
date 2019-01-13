package irvine.oeis.a123;

import irvine.oeis.LinearRecurrence;

/**
 * A123957.
 * @author Sean A. Irvine
 */
public class A123957 extends LinearRecurrence {

  /** Construct the sequence. */
  public A123957() {
    super(new long[] {-4, -4, 3, 0}, new long[] {0, 0, 0, 1});
  }
}
