package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158123 a(n) = 81*n + 1.
 * @author Sean A. Irvine
 */
public class A158123 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158123() {
    super(new long[] {-1, 2}, new long[] {82, 163});
  }
}
