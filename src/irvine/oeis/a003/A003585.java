package irvine.oeis.a003;

import irvine.oeis.FiniteSequence;

/**
 * A003585 Odd numbers that are not of the form <code>x^2 +</code> y^2 + 10*z^2.
 * @author Sean A. Irvine
 */
public class A003585 extends FiniteSequence {

  /** Construct the sequence. */
  public A003585() {
    super(3, 7, 21, 31, 33, 43, 67, 79, 87, 133, 217, 219, 223, 253, 307, 391, 679, 2719);
  }
}

