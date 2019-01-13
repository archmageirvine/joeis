package irvine.oeis.a262;

import irvine.oeis.LinearRecurrence;

/**
 * A262864.
 * @author Sean A. Irvine
 */
public class A262864 extends LinearRecurrence {

  /** Construct the sequence. */
  public A262864() {
    super(new long[] {-2, 3, -3, 3}, new long[] {1, 2, 4, 9});
  }
}
