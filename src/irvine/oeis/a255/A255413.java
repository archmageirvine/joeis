package irvine.oeis.a255;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A255413 a(n) = 15*n - 11 + (n mod 2). Row 3 of Ludic array A255127.
 * @author Georg Fischer
 */
public class A255413 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A255413() {
    // /(-x^3+x^2+x-1)
    super(1, "[0,1,-1,-1,1]", "5,19,35", 0);
  }
}
