package irvine.oeis.a266;

import irvine.oeis.LinearRecurrence;

/**
 * A266979 Binary representation of the n-th iteration of the "Rule <code>79"</code> elementary cellular automaton starting with a single ON (black) cell.
 * @author Sean A. Irvine
 */
public class A266979 extends LinearRecurrence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A266979() {
    super(new long[] {1000000, 0, -1010100, 0, 10101, 0}, new long[] {1, 110, 101, 1111010, 10101, 11111101010L});
  }
}
