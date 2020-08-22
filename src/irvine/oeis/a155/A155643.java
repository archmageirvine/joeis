package irvine.oeis.a155;

import irvine.oeis.LinearRecurrence;

/**
 * A155643 10^n-5^n+1.
 * @author Sean A. Irvine
 */
public class A155643 extends LinearRecurrence {

  /** Construct the sequence. */
  public A155643() {
    super(new long[] {50, -65, 16}, new long[] {1, 6, 76});
  }
}
