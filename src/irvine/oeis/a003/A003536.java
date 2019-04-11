package irvine.oeis.a003;

import irvine.oeis.FiniteSequence;

/**
 * A003536 Divisors of <code>2^28 - 1</code>.
 * @author Sean A. Irvine
 */
public class A003536 extends FiniteSequence {

  /** Construct the sequence. */
  public A003536() {
    super(A003529.divisors(28));
  }
}

