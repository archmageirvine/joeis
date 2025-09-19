package irvine.oeis.a158;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A158374 a(n) = 625*n - 1.
 * @author Sean A. Irvine
 */
public class A158374 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158374() {
    super(1, new long[] {-1, 2}, new long[] {624, 1249});
  }
}
