package irvine.oeis.a154;

import irvine.oeis.LinearRecurrence;

/**
 * A154292.
 * @author Sean A. Irvine
 */
public class A154292 extends LinearRecurrence {

  /** Construct the sequence. */
  public A154292() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {11, 13, 46, 50, 105});
  }
}
