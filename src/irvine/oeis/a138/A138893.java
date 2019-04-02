package irvine.oeis.a138;

import irvine.oeis.LinearRecurrence;

/**
 * A138893 A generalized Chamberland function.
 * @author Sean A. Irvine
 */
public class A138893 extends LinearRecurrence {

  /** Construct the sequence. */
  public A138893() {
    super(new long[] {-1, 2, -3, 4, -3, 2}, new long[] {0, 11, 36, 29, 8, 47});
  }
}
