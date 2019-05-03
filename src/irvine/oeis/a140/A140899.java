package irvine.oeis.a140;

import irvine.oeis.LinearRecurrence;

/**
 * A140899 <code>A140724(n+4)</code>. Period <code>10</code>: repeat <code>7, 9, 5, 1, 3, 3, 1, 5, 9, 7</code>.
 * @author Sean A. Irvine
 */
public class A140899 extends LinearRecurrence {

  /** Construct the sequence. */
  public A140899() {
    super(new long[] {1, -2, 2, -2, 2}, new long[] {7, 9, 5, 1, 3});
  }
}
