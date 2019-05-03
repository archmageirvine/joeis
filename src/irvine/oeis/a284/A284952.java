package irvine.oeis.a284;

import irvine.oeis.FiniteSequence;

/**
 * A284952 Number of elements of order n in the Tits group <code>TF4(2)'</code>.
 * @author Sean A. Irvine
 */
public class A284952 extends FiniteSequence {

  // Could be done via OrdersFiniteGroupSequence, but too slow for TF4(2)'

  /** Construct the sequence. */
  public A284952() {
    super(1, 13455, 166400, 514800, 359424, 1497600, 0, 3369600, 0, 1797120, 0, 2995200, 2764800, 0, 0, 4492800);
  }
}

