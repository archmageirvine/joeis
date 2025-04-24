package irvine.oeis.a076;

import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A077496 Decimal expansion of lim_{n -&gt; infinity} A001699(n)^(1/2^n).
 * @author Sean A. Irvine
 */
public class A077496 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A077496() {
    super(1, new A076949().getCR().square());
  }
}

