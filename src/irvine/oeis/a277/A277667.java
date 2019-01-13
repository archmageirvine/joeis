package irvine.oeis.a277;

import irvine.oeis.LinearRecurrence;

/**
 * A277667.
 * @author Sean A. Irvine
 */
public class A277667 extends LinearRecurrence {

  /** Construct the sequence. */
  public A277667() {
    super(new long[] {-1, 2, -3, 4}, new long[] {1, 4, 13, 42});
  }
}
