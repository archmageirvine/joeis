package irvine.oeis.a280;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A280014 Numbers m == +- 2 (mod 10) but not m == 2 (mod 6).
 * @author Sean A. Irvine
 */
public class A280014 extends LinearRecurrence {

  /** Construct the sequence. */
  public A280014() {
    super(1, new long[] {-1, 1, 0, 0, 1}, new long[] {12, 18, 22, 28, 42});
  }
}
