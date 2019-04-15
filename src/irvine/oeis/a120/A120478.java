package irvine.oeis.a120;

import irvine.oeis.LinearRecurrence;

/**
 * A120478 <code>Binomial(n+6,5)-binomial(n,5)</code>.
 * @author Sean A. Irvine
 */
public class A120478 extends LinearRecurrence {

  /** Construct the sequence. */
  public A120478() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {6, 21, 56, 126, 252});
  }
}
