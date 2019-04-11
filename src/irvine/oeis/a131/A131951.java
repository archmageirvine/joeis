package irvine.oeis.a131;

import irvine.oeis.LinearRecurrence;

/**
 * A131951 <code>2^n+n*(n+3)</code>.
 * @author Sean A. Irvine
 */
public class A131951 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131951() {
    super(new long[] {-2, 7, -9, 5}, new long[] {1, 6, 14, 26});
  }
}
