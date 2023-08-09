package irvine.oeis.a319;
// manually holsig2/holos at 2023-08-08 18:53

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A319658 a(n) is the minimal number of successive ON cells that appears in n-th generation of rule-30 1D cellular automaton started from a single ON cell.
 * @author Georg Fischer
 */
public class A319658 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A319658() {
    super(1, "[0, 1,-1]", "1, 3, 1, 2, 1, 2, 1, 2, 1, 1, 1, 1, 1, 2, 1", 0);
  }
}
