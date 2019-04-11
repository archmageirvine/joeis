package irvine.oeis.a140;

import irvine.oeis.LinearRecurrence;

/**
 * A140681 <code>a(n) = 3*n*(n+6)</code>.
 * @author Sean A. Irvine
 */
public class A140681 extends LinearRecurrence {

  /** Construct the sequence. */
  public A140681() {
    super(new long[] {1, -3, 3}, new long[] {0, 21, 48});
  }
}
