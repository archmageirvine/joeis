package irvine.oeis.a287;

import irvine.oeis.FiniteSequence;

/**
 * A287219 The numbers which are of the form (a*100 + b*10 + c)*(d*10 + e) = (f*10 + g)*(h*10 + i) (a, b, ... , i are nine digits, 1, 2, ... , 9).
 * @author Georg Fischer
 */
public class A287219 extends FiniteSequence {

  /** Construct the sequence. */
  public A287219() {
    super(1, FINITE, 3634, 3726, 3886, 4002, 4234, 4662, 5022, 5056, 5568, 7008, 7448);
  }
}
