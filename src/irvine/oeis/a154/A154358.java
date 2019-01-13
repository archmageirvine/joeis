package irvine.oeis.a154;

import irvine.oeis.LinearRecurrence;

/**
 * A154358.
 * @author Sean A. Irvine
 */
public class A154358 extends LinearRecurrence {

  /** Construct the sequence. */
  public A154358() {
    super(new long[] {1, -3, 3}, new long[] {649, 99, 2049});
  }
}
