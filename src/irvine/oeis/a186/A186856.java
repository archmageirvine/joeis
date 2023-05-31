package irvine.oeis.a186;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A186856 Number of 7-step knight's tours on an (n+2) X (n+2) board summed over all starting positions.
 * @author Georg Fischer
 */
public class A186856 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A186856() {
    super(1, "[[1332608,-855176,126440],[-1]]", "16,1280,21664,118480,372384,847520,1584576,2596480,3879696,5424848", 0);
  }
}
