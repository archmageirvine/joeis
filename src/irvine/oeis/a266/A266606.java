package irvine.oeis.a266;

import irvine.oeis.LinearRecurrence;

/**
 * A266606 Binary representation of the n-th iteration of the "Rule <code>39"</code> elementary cellular automaton starting with a single ON (black) cell.
 * @author Sean A. Irvine
 */
public class A266606 extends LinearRecurrence {

  /** Construct the sequence. */
  public A266606() {
    super(new long[] {100000, 0, -110010, 0, 10011, 0}, new long[] {1, 110, 10, 1111101, 100, 11111111011L});
  }
}
