package irvine.oeis.a226;

import irvine.oeis.LinearRecurrence;

/**
 * A226203 <code>a(5n) = a(5n+3) = a(5n+4) = 2n+1, a(5n+1) = 2n-3, a(5n+2) = 2n-1</code>.
 * @author Sean A. Irvine
 */
public class A226203 extends LinearRecurrence {

  /** Construct the sequence. */
  public A226203() {
    super(new long[] {-1, 1, 0, 0, 0, 1}, new long[] {1, -3, -1, 1, 1, 3});
  }
}
