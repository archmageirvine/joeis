package irvine.oeis.a262;

import irvine.oeis.LinearRecurrence;

/**
 * A262864 Decimal representation of the middle column of the "Rule <code>147"</code> elementary cellular automaton starting with a single ON (black) cell.
 * @author Sean A. Irvine
 */
public class A262864 extends LinearRecurrence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A262864() {
    super(new long[] {-2, 3, -3, 3}, new long[] {1, 2, 4, 9});
  }
}
