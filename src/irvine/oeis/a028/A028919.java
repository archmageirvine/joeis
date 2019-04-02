package irvine.oeis.a028;

import irvine.oeis.LinearRecurrence;

/**
 * A028919 Congruent to 0, 6, 10, 12 (mod 14).
 * @author Sean A. Irvine
 */
public class A028919 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028919() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {0, 6, 10, 12, 14});
  }
}
