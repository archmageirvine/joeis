package irvine.oeis.a220;

import irvine.oeis.LinearRecurrence;

/**
 * A220982 6^(4n+2) + 6^(3n+2) + 3 * 6^(2n+1) + 6^(n+1) + 1: the right Aurifeuillian factor of 6^(12n+6) + 1.
 * @author Sean A. Irvine
 */
public class A220982 extends LinearRecurrence {

  /** Construct the sequence. */
  public A220982() {
    super(new long[] {60466176, -72550080, 12427560, -345210, 1555}, new long[] {97, 55117, 62169337, 78727802257L, 101638351073377L});
  }
}
