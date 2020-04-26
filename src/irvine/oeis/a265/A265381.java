package irvine.oeis.a265;

import irvine.oeis.LinearRecurrence;

/**
 * A265381 Decimal representation of the middle column of the "Rule <code>158"</code> elementary cellular automaton starting with a single ON (black) cell.
 * @author Sean A. Irvine
 */
public class A265381 extends LinearRecurrence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A265381() {
    super(new long[] {-2, 1, 0, 0, 2}, new long[] {1, 3, 7, 14, 29});
  }
}
