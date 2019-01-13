package irvine.oeis.a154;

import irvine.oeis.LinearRecurrence;

/**
 * A154359.
 * @author Sean A. Irvine
 */
public class A154359 extends LinearRecurrence {

  /** Construct the sequence. */
  public A154359() {
    super(new long[] {1, -3, 3}, new long[] {99, 649, 3699});
  }
}
