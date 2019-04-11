package irvine.oeis.a134;

import irvine.oeis.LinearRecurrence;

/**
 * A134582 <code>a(n) = (2*n)^2 - 4</code>.
 * @author Sean A. Irvine
 */
public class A134582 extends LinearRecurrence {

  /** Construct the sequence. */
  public A134582() {
    super(new long[] {1, -3, 3}, new long[] {0, 12, 32});
  }
}
