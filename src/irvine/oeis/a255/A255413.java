package irvine.oeis.a255;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A255413 Row 3 of Ludic array A255127: a(n) = A007310((5*n)-3).
 * @author Georg Fischer
 */
public class A255413 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A255413() {
    // /(-x^3+x^2+x-1)
    super(1, "[0,1,-1,-1,1]", "5,19,35", 0);
  }
}
