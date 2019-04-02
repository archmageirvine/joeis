package irvine.oeis.a110;

import irvine.oeis.LinearRecurrence;

/**
 * A110528 a(n+3) = 3*a(n+2) + 5*a(n+1) + a(n), a(0) = 1, a(1) = 10, a(2) = 37.
 * @author Sean A. Irvine
 */
public class A110528 extends LinearRecurrence {

  /** Construct the sequence. */
  public A110528() {
    super(new long[] {1, 5, 3}, new long[] {1, 10, 37});
  }
}
