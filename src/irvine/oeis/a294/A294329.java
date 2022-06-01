package irvine.oeis.a294;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A294329 a(n) = 8*((9*n + 8)*10^n - 8)/81.
 * @author Sean A. Irvine
 */
public class A294329 extends LinearRecurrence {

  /** Construct the sequence. */
  public A294329() {
    super(new long[] {100, -120, 21}, new long[] {0, 16, 256});
  }
}
