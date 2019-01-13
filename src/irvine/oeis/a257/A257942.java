package irvine.oeis.a257;

import irvine.oeis.LinearRecurrence;

/**
 * A257942.
 * @author Sean A. Irvine
 */
public class A257942 extends LinearRecurrence {

  /** Construct the sequence. */
  public A257942() {
    super(new long[] {1, -3, 6, -10, 12, -12, 10, -6, 3}, new long[] {1, 3, 12, 20, 15, 21, 56, 72, 45});
  }
}
