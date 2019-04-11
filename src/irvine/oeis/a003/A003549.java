package irvine.oeis.a003;

import irvine.oeis.FiniteSequence;

/**
 * A003549 Divisors of <code>2^44 - 1</code>.
 * @author Sean A. Irvine
 */
public class A003549 extends FiniteSequence {

  /** Construct the sequence. */
  public A003549() {
    super(A003529.divisors(44));
  }
}

