package irvine.oeis.a027;

import irvine.oeis.LinearRecurrence;

/**
 * A027621 a(n) = n + (n+1)^2 + (n+2)^3 + (n+3)^4.
 * @author Sean A. Irvine
 */
public class A027621 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027621() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {90, 288, 700, 1440, 2646});
  }
}
