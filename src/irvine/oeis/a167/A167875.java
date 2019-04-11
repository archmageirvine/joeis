package irvine.oeis.a167;

import irvine.oeis.LinearRecurrence;

/**
 * A167875 One third of product plus sum of three consecutive nonnegative integers; <code>a(n)=(n+1)(n^2+2n+3)/3</code>.
 * @author Sean A. Irvine
 */
public class A167875 extends LinearRecurrence {

  /** Construct the sequence. */
  public A167875() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 4, 11, 24});
  }
}
