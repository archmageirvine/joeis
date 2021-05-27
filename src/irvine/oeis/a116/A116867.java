package irvine.oeis.a116;
// manually 2021-05-26

import irvine.oeis.HolonomicRecurrence;

/**
 * A116867 Convolution of generalized Catalan sequence A064063 (named C(3;n)).
 * 2*a(n) +(-23*n+37)*a(n-1) +6*(-2*n+1)*a(n-2)=0.
 * @author Georg Fischer
 */
public class A116867 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A116867() { 
    super(0, "[[[0],[6,-12],[37,-23],[0, 2]]","1, 2, 9", 0);
  }
}
