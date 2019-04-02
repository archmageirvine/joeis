package irvine.oeis.a069;

import irvine.oeis.LinearRecurrence;

/**
 * A069074 a(n) = (2*n+2)*(2*n+3)*(2*n+4) = 24*A000330(n+1).
 * @author Sean A. Irvine
 */
public class A069074 extends LinearRecurrence {

  /** Construct the sequence. */
  public A069074() {
    super(new long[] {-1, 4, -6, 4}, new long[] {24, 120, 336, 720});
  }
}
