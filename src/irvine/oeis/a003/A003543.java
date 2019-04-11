package irvine.oeis.a003;

import irvine.oeis.FiniteSequence;

/**
 * A003543 Divisors of <code>2^36 - 1</code>.
 * @author Sean A. Irvine
 */
public class A003543 extends FiniteSequence {

  /** Construct the sequence. */
  public A003543() {
    super(A003529.divisors(36));
  }
}

