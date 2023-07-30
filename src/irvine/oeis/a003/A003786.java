package irvine.oeis.a003;

import irvine.oeis.FiniteSequence;

/**
 * A003786 Day-of-month at weekly intervals from Jan 01 of a leap year (a finite sequence with 53 terms).
 * @author GEorg Fischer
 */
public class A003786 extends FiniteSequence {

  /** Construct the sequence, */
  public A003786() {
    super(1, FINITE, "1,8,15,22,29,5,12,19,26,4,11,18,25,1,8,15,22,29,6,13,20,27,3,10,17,24,1,8,15,22,29,5,12,19,26,2,9,16,23,30,7,14,21,28,4,11,18,25,2,9,16,23,30");
  }
}
