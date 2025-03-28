package irvine.oeis.a199;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A199565 a(n) = (7*9^n + 1)/4.
 * @author Sean A. Irvine
 */
public class A199565 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199565() {
    super(new long[] {-9, 10}, new long[] {2, 16});
  }
}
