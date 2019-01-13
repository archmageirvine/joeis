package irvine.oeis.a181;

import irvine.oeis.LinearRecurrence;

/**
 * A181510.
 * @author Sean A. Irvine
 */
public class A181510 extends LinearRecurrence {

  /** Construct the sequence. */
  public A181510() {
    super(new long[] {1, -3, 3}, new long[] {6, 18, 34});
  }
}
