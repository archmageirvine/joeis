package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158406 <code>a(n) = 900*n^2 + 2*n</code>.
 * @author Sean A. Irvine
 */
public class A158406 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158406() {
    super(new long[] {1, -3, 3}, new long[] {902, 3604, 8106});
  }
}
