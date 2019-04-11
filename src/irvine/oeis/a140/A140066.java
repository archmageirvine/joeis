package irvine.oeis.a140;

import irvine.oeis.LinearRecurrence;

/**
 * A140066 <code>a(n) = (5*n^2 - 11*n + 8)/2</code>.
 * @author Sean A. Irvine
 */
public class A140066 extends LinearRecurrence {

  /** Construct the sequence. */
  public A140066() {
    super(new long[] {1, -3, 3}, new long[] {1, 3, 10});
  }
}
