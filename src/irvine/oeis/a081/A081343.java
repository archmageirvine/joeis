package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081343 (10^n+4^n)/2.
 * @author Sean A. Irvine
 */
public class A081343 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081343() {
    super(new long[] {-40, 14}, new long[] {1, 7});
  }
}
