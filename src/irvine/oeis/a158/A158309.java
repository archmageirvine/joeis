package irvine.oeis.a158;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A158309 a(n) = 361*n^2 + 2*n.
 * @author Sean A. Irvine
 */
public class A158309 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158309() {
    super(1, new long[] {1, -3, 3}, new long[] {363, 1448, 3255});
  }
}
