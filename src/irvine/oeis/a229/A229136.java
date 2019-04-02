package irvine.oeis.a229;

import irvine.oeis.LinearRecurrence;

/**
 * A229136 Number of solutions to Sum(x_i^2, i=1...n) == 1 (mod 4).
 * @author Sean A. Irvine
 */
public class A229136 extends LinearRecurrence {

  /** Construct the sequence. */
  public A229136() {
    super(new long[] {32, -24, 8}, new long[] {2, 8, 24});
  }
}
