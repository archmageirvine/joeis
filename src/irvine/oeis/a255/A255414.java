package irvine.oeis.a255;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A255414 Row 4 of Ludic array A255127.
 * @author Georg Fischer
 */
public class A255414 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A255414() {
    // /(x^9-x^8-x+1)
    super(0, "[0,1,-1,0,0,0,0,0,0,-1,1]", "7,31,59,85,113,137,163,191,217", 0);
  }
}
