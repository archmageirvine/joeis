package irvine.oeis.a277;

import irvine.oeis.LinearRecurrence;

/**
 * A277980.
 * @author Sean A. Irvine
 */
public class A277980 extends LinearRecurrence {

  /** Construct the sequence. */
  public A277980() {
    super(new long[] {1, -3, 3}, new long[] {0, 30, 84});
  }
}
