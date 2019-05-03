package irvine.oeis.a131;

import irvine.oeis.LinearRecurrence;

/**
 * A131174 <code>a(2n) = 2*A000217(n), a(2n+1) = A000217(n)</code>.
 * @author Sean A. Irvine
 */
public class A131174 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131174() {
    super(new long[] {1, 0, -3, 0, 3, 0}, new long[] {0, 0, 2, 1, 6, 3});
  }
}
