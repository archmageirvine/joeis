package irvine.oeis.a319;
// manually holsig2/holos at 2023-08-08 18:53

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A319610 a(n) is the minimal number of successive OFF cells that appears in n-th generation of rule-30 1D cellular automaton started from a single ON cell.
 * @author Georg Fischer
 */
public class A319610 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A319610() {
    super(0, "[0, 1,-1]", "0, 0, 2, 1, 2, 1, 2, 1, 2, 1", 0);
  }
}
