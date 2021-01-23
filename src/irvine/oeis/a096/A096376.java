package irvine.oeis.a096;

import irvine.oeis.LinearRecurrence;

/**
 * A096376 a(n) = n + (n-1)^2 + (n+1)^2.
 * @author Sean A. Irvine
 */
public class A096376 extends LinearRecurrence {

  /** Construct the sequence. */
  public A096376() {
    super(new long[] {1, -3, 3}, new long[] {2, 5, 12});
  }
}
