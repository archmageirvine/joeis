package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158447 <code>a(n) = 10*n^2 - 1</code>.
 * @author Sean A. Irvine
 */
public class A158447 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158447() {
    super(new long[] {1, -3, 3}, new long[] {9, 39, 89});
  }
}
