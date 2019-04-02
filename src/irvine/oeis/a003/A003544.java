package irvine.oeis.a003;

import irvine.oeis.FiniteSequence;

/**
 * A003544 Divisors of 2^38 - 1.
 * @author Sean A. Irvine
 */
public class A003544 extends FiniteSequence {

  /** Construct the sequence. */
  public A003544() {
    super(A003529.divisors(38));
  }
}

