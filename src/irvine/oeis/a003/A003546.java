package irvine.oeis.a003;

import irvine.oeis.FiniteSequence;

/**
 * A003546.
 * @author Sean A. Irvine
 */
public class A003546 extends FiniteSequence {

  /** Construct the sequence. */
  public A003546() {
    super(A003529.divisors(40));
  }
}

