package irvine.oeis.a003;

import irvine.oeis.FiniteSequence;

/**
 * A003548 Divisors of <code>2^43 - 1</code>.
 * @author Sean A. Irvine
 */
public class A003548 extends FiniteSequence {

  /** Construct the sequence. */
  public A003548() {
    super(A003529.divisors(43));
  }
}

