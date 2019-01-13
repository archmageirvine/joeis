package irvine.oeis.a248;

import irvine.oeis.LinearRecurrence;

/**
 * A248917.
 * @author Sean A. Irvine
 */
public class A248917 extends LinearRecurrence {

  /** Construct the sequence. */
  public A248917() {
    super(new long[] {-8, 20, -18, 7}, new long[] {1, 3, 17, 73});
  }
}
