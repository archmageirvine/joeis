package irvine.oeis.a098;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A098442 Expansion of 1/sqrt(1-2x-95x^2).
 * a(n+2) = ( (2*n+3)*a(n+1) + 95*(n+1)*a(n) )/(n+2).
 * @author Georg Fischer
 */
public class A098442 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A098442() {
    super(0, "[[0],[95, 95],[3, 2],[-2,-1]", "1", 2);
  }
}
