package irvine.oeis.a262;

import irvine.oeis.LinearRecurrence;

/**
 * A262863 Binary representation of the middle column of the "Rule <code>147"</code> elementary cellular automaton starting with a single ON (black) cell.
 * @author Sean A. Irvine
 */
public class A262863 extends LinearRecurrence {

  /** Construct the sequence. */
  public A262863() {
    super(new long[] {-10, 11, -11, 11}, new long[] {1, 10, 100, 1001});
  }
}
