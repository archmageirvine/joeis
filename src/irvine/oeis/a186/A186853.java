package irvine.oeis.a186;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A186853 Number of 4-step knight's tours on an (n+2) X (n+2) board summed over all starting positions.
 * @author Georg Fischer
 */
public class A186853 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A186853() {
    super(1, "[[496,-1048,392],[-1]]", "16,208,976", 0);
  }
}
