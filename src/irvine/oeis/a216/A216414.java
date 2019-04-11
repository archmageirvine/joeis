package irvine.oeis.a216;

import irvine.oeis.LinearRecurrence;

/**
 * A216414 <code>a(n) =</code> (-1)^(n-3)*binomial(n,3) <code>- 1</code>.
 * @author Sean A. Irvine
 */
public class A216414 extends LinearRecurrence {

  /** Construct the sequence. */
  public A216414() {
    super(new long[] {1, 3, 2, -2, -3}, new long[] {0, -5, 9, -21, 34});
  }
}
