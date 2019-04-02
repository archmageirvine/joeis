package irvine.oeis.a188;

import irvine.oeis.LinearRecurrence;

/**
 * A188134 a(4*n) = n, a(1+2*n) = 4+8*n, a(2+4*n) = 2+4*n.
 * @author Sean A. Irvine
 */
public class A188134 extends LinearRecurrence {

  /** Construct the sequence. */
  public A188134() {
    super(new long[] {-1, 0, 0, 0, 2, 0, 0, 0}, new long[] {0, 4, 2, 12, 1, 20, 6, 28});
  }
}
