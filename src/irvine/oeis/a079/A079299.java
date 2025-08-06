package irvine.oeis.a079;

import irvine.oeis.ComplementSequence;

/**
 * A079299 Not a binomial number: not of form a^k +- b^k for k &gt;= 2.
 * @author Sean A. Irvine
 */
public class A079299 extends ComplementSequence {

  /** Construct the sequence. */
  public A079299() {
    super(1, new A079298());
  }
}
