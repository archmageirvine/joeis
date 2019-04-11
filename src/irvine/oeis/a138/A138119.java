package irvine.oeis.a138;

import irvine.oeis.LinearRecurrence;

/**
 * A138119 Concatenation of n digits 1 and <code>2n-1</code> digits 0.
 * @author Sean A. Irvine
 */
public class A138119 extends LinearRecurrence {

  /** Construct the sequence. */
  public A138119() {
    super(new long[] {-100000, 1100}, new long[] {10, 11000});
  }
}
