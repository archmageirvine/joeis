package irvine.oeis.a131;

import irvine.oeis.LinearRecurrence;

/**
 * A131360 <code>a(4n) = a(4n+1) = 0, a(4n+2) = 2n, a(4n+3) = 2n+1</code>.
 * @author Sean A. Irvine
 */
public class A131360 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131360() {
    super(new long[] {-1, 1, -1, 1, 1, -1, 1}, new long[] {0, 0, 0, 1, 0, 0, 2});
  }
}
