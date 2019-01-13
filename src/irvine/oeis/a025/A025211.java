package irvine.oeis.a025;

import irvine.oeis.LinearRecurrence;

/**
 * A025211.
 * @author Sean A. Irvine
 */
public class A025211 extends LinearRecurrence {

  /** Construct the sequence. */
  public A025211() {
    super(new long[] {-120, 154, -71, 14}, new long[] {1, 14, 125, 910});
  }
}
