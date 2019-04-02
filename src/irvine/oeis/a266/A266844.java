package irvine.oeis.a266;

import irvine.oeis.LinearRecurrence;

/**
 * A266844 Binary representation of the n-th iteration of the "Rule 70" elementary cellular automaton starting with a single ON (black) cell.
 * @author Sean A. Irvine
 */
public class A266844 extends LinearRecurrence {

  /** Construct the sequence. */
  public A266844() {
    super(new long[] {-100000, 10000, 10}, new long[] {1, 110, 10100});
  }
}
