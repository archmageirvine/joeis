package irvine.oeis.a084;

import irvine.oeis.LinearRecurrence;

/**
 * A084851 Binomial transform of <code>binomial(n+2,2)</code>.
 * @author Sean A. Irvine
 */
public class A084851 extends LinearRecurrence {

  /** Construct the sequence. */
  public A084851() {
    super(new long[] {8, -12, 6}, new long[] {1, 4, 13});
  }
}
