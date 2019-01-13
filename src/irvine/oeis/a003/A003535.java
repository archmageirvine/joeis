package irvine.oeis.a003;

import irvine.oeis.FiniteSequence;

/**
 * A003535.
 * @author Sean A. Irvine
 */
public class A003535 extends FiniteSequence {

  /** Construct the sequence. */
  public A003535() {
    super(A003529.divisors(27));
  }
}

