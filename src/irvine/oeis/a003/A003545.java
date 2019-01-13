package irvine.oeis.a003;

import irvine.oeis.FiniteSequence;

/**
 * A003545.
 * @author Sean A. Irvine
 */
public class A003545 extends FiniteSequence {

  /** Construct the sequence. */
  public A003545() {
    super(A003529.divisors(39));
  }
}

