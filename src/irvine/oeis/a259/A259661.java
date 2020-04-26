package irvine.oeis.a259;

import irvine.oeis.LinearRecurrence;

/**
 * A259661 Binary representation of the middle column of the "Rule <code>54"</code> elementary cellular automaton starting with a single ON cell.
 * @author Sean A. Irvine
 */
public class A259661 extends LinearRecurrence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A259661() {
    super(new long[] {-10, 11, -11, 11}, new long[] {1, 11, 110, 1100});
  }
}
