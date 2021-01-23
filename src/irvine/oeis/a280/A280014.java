package irvine.oeis.a280;

import irvine.oeis.LinearRecurrence;

/**
 * A280014 Numbers n == +- 2 (mod 10) but not n == 2 (mod 6).
 * @author Sean A. Irvine
 */
public class A280014 extends LinearRecurrence {

  /** Construct the sequence. */
  public A280014() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {12, 18, 22, 28, 42});
  }
}
