package irvine.oeis.a131;

import irvine.oeis.LinearRecurrence;

/**
 * A131640.
 * @author Sean A. Irvine
 */
public class A131640 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131640() {
    super(new long[] {-1, 1, 0, 1}, new long[] {985, 1035, 1085, 1160});
  }
}
