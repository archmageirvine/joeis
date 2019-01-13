package irvine.oeis.a003;

import irvine.oeis.FiniteSequence;

/**
 * A003531.
 * @author Sean A. Irvine
 */
public class A003531 extends FiniteSequence {

  /** Construct the sequence. */
  public A003531() {
    super(A003529.divisors(22));
  }
}

