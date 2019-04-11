package irvine.oeis.a259;

import irvine.oeis.LinearRecurrence;

/**
 * A259055 <code>a(n) = 9*n^2 + 18*n + 7</code>.
 * @author Sean A. Irvine
 */
public class A259055 extends LinearRecurrence {

  /** Construct the sequence. */
  public A259055() {
    super(new long[] {1, -3, 3}, new long[] {7, 34, 79});
  }
}
