package irvine.oeis.a143;

import irvine.oeis.LinearRecurrence;

/**
 * A143699 a(n) = 19*a(n-1) - 41*a(n-2) + 19*a(n-3) - a(n-4).
 * @author Sean A. Irvine
 */
public class A143699 extends LinearRecurrence {

  /** Construct the sequence. */
  public A143699() {
    super(new long[] {-1, 19, -41, 19}, new long[] {0, 1, 19, 319});
  }
}
