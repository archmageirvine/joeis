package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037504.
 * @author Sean A. Irvine
 */
public class A037504 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037504() {
    super(new long[] {-3, 1, 0, 3}, new long[] {1, 5, 15, 46});
  }
}
