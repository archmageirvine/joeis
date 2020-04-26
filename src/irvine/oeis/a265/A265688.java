package irvine.oeis.a265;

import irvine.oeis.LinearRecurrence;

/**
 * A265688 Binary representation of the n-th iteration of the "Rule <code>190"</code> elementary cellular automaton starting with a single ON (black) cell.
 * @author Sean A. Irvine
 */
public class A265688 extends LinearRecurrence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A265688() {
    super(new long[] {-100, 1, 100}, new long[] {1, 111, 11101});
  }
}
