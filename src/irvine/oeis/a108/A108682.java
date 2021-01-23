package irvine.oeis.a108;

import irvine.oeis.LinearRecurrence;

/**
 * A108682 a(n) = (n+1)*(n+2)^2*(n+3)*(n+4)*(4*n^2+15*n+15)/720.
 * @author Sean A. Irvine
 */
public class A108682 extends LinearRecurrence {

  /** Construct the sequence. */
  public A108682() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {1, 17, 122, 560, 1946, 5586, 13944, 31284});
  }
}
