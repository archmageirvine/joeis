package irvine.oeis.a088;

import irvine.oeis.LinearRecurrence;

/**
 * A088015.
 * @author Sean A. Irvine
 */
public class A088015 extends LinearRecurrence {

  /** Construct the sequence. */
  public A088015() {
    super(new long[] {2, 2, -7, 1, 3}, new long[] {1, 0, 4, 6, 20});
  }
}
