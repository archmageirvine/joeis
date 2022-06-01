package irvine.oeis.a158;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A158309 361n^2 + 2n.
 * @author Sean A. Irvine
 */
public class A158309 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158309() {
    super(new long[] {1, -3, 3}, new long[] {363, 1448, 3255});
  }
}
