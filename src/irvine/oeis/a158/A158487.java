package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158487 a(n) = 64*n^2 - 8.
 * @author Sean A. Irvine
 */
public class A158487 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158487() {
    super(new long[] {1, -3, 3}, new long[] {56, 248, 568});
  }
}
