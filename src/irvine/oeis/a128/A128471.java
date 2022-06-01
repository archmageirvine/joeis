package irvine.oeis.a128;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A128471 30*n+7.
 * @author Sean A. Irvine
 */
public class A128471 extends LinearRecurrence {

  /** Construct the sequence. */
  public A128471() {
    super(new long[] {-1, 2}, new long[] {7, 37});
  }
}
