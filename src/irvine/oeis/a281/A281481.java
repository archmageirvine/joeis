package irvine.oeis.a281;

import irvine.oeis.LinearRecurrence;

/**
 * A281481 a(n) = 2^(n - 1) * (2^n + 1) + 1.
 * @author Sean A. Irvine
 */
public class A281481 extends LinearRecurrence {

  /** Construct the sequence. */
  public A281481() {
    super(new long[] {8, -14, 7}, new long[] {2, 4, 11});
  }
}
