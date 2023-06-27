package irvine.oeis.a098;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A098502 16*n - 4.
 * @author Sean A. Irvine
 */
public class A098502 extends LinearRecurrence {

  /** Construct the sequence. */
  public A098502() {
    super(1, new long[] {-1, 2}, new long[] {12, 28});
  }
}
