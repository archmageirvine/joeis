package irvine.oeis.a002;
// manually

import irvine.oeis.HolonomicRecurrence;

/**
 * A002739 ((2*n-1)! /(2*n!*(n-2)!))*((n^3-3*n^2+2*n+2)/(n^2-1)).
 * @author Georg Fischer
 */
public class A002739 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A002739() {
    super(2, "[[0],[4,-4,-14, 14,-4],[-4, 7, 5,-5, 1]]", "[1, 10]", 0);
    // -a(n)/a(n-1) = -2*(2*n-1)*(n^3-3*n^2+2*n+2)/(n^3-6*n^2+11*n-4)/(n+1)
  }
}
