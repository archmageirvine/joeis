package irvine.oeis.a084;

import irvine.oeis.LinearRecurrence;

/**
 * A084247.
 * @author Sean A. Irvine
 */
public class A084247 extends LinearRecurrence {

  /** Construct the sequence. */
  public A084247() {
    super(new long[] {2, -1}, new long[] {1, 2});
  }
}
