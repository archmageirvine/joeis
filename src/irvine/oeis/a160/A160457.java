package irvine.oeis.a160;

import irvine.oeis.LinearRecurrence;

/**
 * A160457.
 * @author Sean A. Irvine
 */
public class A160457 extends LinearRecurrence {

  /** Construct the sequence. */
  public A160457() {
    super(new long[] {1, -3, 3}, new long[] {2, 1, 2});
  }
}
