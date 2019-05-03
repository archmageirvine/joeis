package irvine.oeis.a265;

import irvine.oeis.LinearRecurrence;

/**
 * A265721 Decimal representation of the n-th iteration of the "Rule <code>1"</code> elementary cellular automaton starting with a single ON (black) cell.
 * @author Sean A. Irvine
 */
public class A265721 extends LinearRecurrence {

  /** Construct the sequence. */
  public A265721() {
    super(new long[] {64, 0, -84, 0, 21, 0}, new long[] {1, 0, 4, 99, 16, 1935});
  }
}
