package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037791.
 * @author Sean A. Irvine
 */
public class A037791 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037791() {
    super(new long[] {-9, 10, -10, 10}, new long[] {3, 29, 261, 2350});
  }
}
