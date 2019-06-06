package irvine.oeis.a023;

import irvine.oeis.LinearRecurrence;

/**
 * A023550 Convolution of natural numbers <code>&gt;= 2</code> and <code>(F(2), F(3), F(4), ...)</code>.
 * @author Sean A. Irvine
 */
public class A023550 extends LinearRecurrence {

  /** Construct the sequence. */
  public A023550() {
    super(new long[] {1, -1, -2, 3}, new long[] {2, 7, 16, 32});
  }
}
