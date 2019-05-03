package irvine.oeis.a160;

import irvine.oeis.LinearRecurrence;

/**
 * A160706 Hankel transform of <code>A052702(n+1)</code>.
 * @author Sean A. Irvine
 */
public class A160706 extends LinearRecurrence {

  /** Construct the sequence. */
  public A160706() {
    super(new long[] {-1, 1, -1, -1, 1}, new long[] {0, 0, 0, 1, 0});
  }
}
