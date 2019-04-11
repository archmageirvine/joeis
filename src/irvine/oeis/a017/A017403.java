package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017403 <code>(11n+1)^3</code>.
 * @author Sean A. Irvine
 */
public class A017403 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017403() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 1728, 12167, 39304});
  }
}
