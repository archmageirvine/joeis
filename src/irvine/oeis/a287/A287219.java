package irvine.oeis.a287;

import irvine.oeis.FiniteSequence;

/**
 * A287219 The numbers which are of the form <code>(a*100 +</code> b*10 + c)*(d*10 + e) = (f*10 + g)*(h*10 + i) <code>(a,</code> b, ... , i are nine digits, <code>1, 2, </code>... <code>, 9)</code>.
 * @author Georg Fischer
 */
public class A287219 extends FiniteSequence {

  /** Construct the sequence. */
  public A287219() {
    super(3634, 3726, 3886, 4002, 4234, 4662, 5022, 5056, 5568, 7008, 7448);
  }
}
