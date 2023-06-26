package irvine.oeis.a003;

import irvine.oeis.FiniteSequence;

/**
 * A003524 Divisors of 2^12 - 1.
 * @author Sean A. Irvine
 */
public class A003524 extends FiniteSequence {

  /** Construct the sequence. */
  public A003524() {
    super(1, FINITE, 1, 3, 5, 7, 9, 13, 15, 21, 35, 39, 45, 63, 65, 91, 105, 117, 195, 273, 315, 455, 585, 819, 1365, 4095);
  }
}

