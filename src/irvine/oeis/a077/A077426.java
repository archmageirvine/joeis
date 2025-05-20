package irvine.oeis.a077;

import irvine.oeis.FilterSequence;
import irvine.oeis.a003.A003814;

/**
 * A077426 Nonsquare integers n such that the continued fraction (sqrt(n)+1)/2 has odd period length.
 * @author Sean A. Irvine
 */
public class A077426 extends FilterSequence {

  /** Construct the sequence. */
  public A077426() {
    super(1, new A003814(), ODD);
  }
}
