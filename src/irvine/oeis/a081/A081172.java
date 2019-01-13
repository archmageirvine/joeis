package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081172.
 * @author Sean A. Irvine
 */
public class A081172 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081172() {
    super(new long[] {1, 1, 1}, new long[] {1, 1, 0});
  }
}
