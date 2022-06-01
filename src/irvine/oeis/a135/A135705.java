package irvine.oeis.a135;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A135705 a(n) = 10*binomial(n,2) + 9*n.
 * @author Sean A. Irvine
 */
public class A135705 extends LinearRecurrence {

  /** Construct the sequence. */
  public A135705() {
    super(new long[] {1, -3, 3}, new long[] {0, 9, 28});
  }
}
