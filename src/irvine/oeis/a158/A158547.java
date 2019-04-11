package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158547 <code>a(n) = 24*n^2 + 1</code>.
 * @author Sean A. Irvine
 */
public class A158547 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158547() {
    super(new long[] {1, -3, 3}, new long[] {1, 25, 97});
  }
}
