package irvine.oeis.a055;

import irvine.oeis.LinearRecurrence;

/**
 * A055504.
 * @author Sean A. Irvine
 */
public class A055504 extends LinearRecurrence {

  /** Construct the sequence. */
  public A055504() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {0, 0, 0, 0, 0, 15, 110});
  }
}
