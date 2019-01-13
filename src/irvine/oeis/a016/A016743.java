package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016743.
 * @author Sean A. Irvine
 */
public class A016743 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016743() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 8, 64, 216});
  }
}
