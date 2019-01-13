package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037513.
 * @author Sean A. Irvine
 */
public class A037513 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037513() {
    super(new long[] {-4, 1, 0, 4}, new long[] {2, 8, 33, 134});
  }
}
