package irvine.oeis.a108;

import irvine.oeis.LinearRecurrence;

/**
 * A108681 a(n) = (n+1)*(n+2)^2*(n+3)*(n+4)*(n+5)*(2*n+3)/720.
 * @author Sean A. Irvine
 */
public class A108681 extends LinearRecurrence {

  /** Construct the sequence. */
  public A108681() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {1, 15, 98, 420, 1386, 3822, 9240, 20196});
  }
}
