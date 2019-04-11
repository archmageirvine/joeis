package irvine.oeis.a247;

import irvine.oeis.LinearRecurrence;

/**
 * A247555 A permutation of the nonnegative numbers: <code>a(4n) = 8n, a(4n+1) = 2n + 1, a(4n+2) = 4n + 2, a(4n+3) = 8n + 4</code>.
 * @author Sean A. Irvine
 */
public class A247555 extends LinearRecurrence {

  /** Construct the sequence. */
  public A247555() {
    super(new long[] {-1, 0, 0, 0, 2, 0, 0, 0}, new long[] {0, 1, 2, 4, 8, 3, 6, 12});
  }
}
