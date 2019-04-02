package irvine.oeis.a049;

import irvine.oeis.LinearRecurrence;

/**
 * A049451 Twice second pentagonal numbers.
 * @author Sean A. Irvine
 */
public class A049451 extends LinearRecurrence {

  /** Construct the sequence. */
  public A049451() {
    super(new long[] {1, -3, 3}, new long[] {0, 4, 14});
  }
}
