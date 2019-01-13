package irvine.oeis.a277;

import irvine.oeis.LinearRecurrence;

/**
 * A277252.
 * @author Sean A. Irvine
 */
public class A277252 extends LinearRecurrence {

  /** Construct the sequence. */
  public A277252() {
    super(new long[] {1, 1, 1, 0}, new long[] {0, 1, 1, 0});
  }
}
