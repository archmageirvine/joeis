package irvine.oeis.a077;

import irvine.oeis.Combiner;

/**
 * A077481 Quotient A077480(n) / A077479(n).
 * @author Sean A. Irvine
 */
public class A077481 extends Combiner {

  /** Construct the sequence. */
  public A077481() {
    super(1, new A077480(), new A077479(), DIVIDE);
  }
}
