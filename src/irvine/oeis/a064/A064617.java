package irvine.oeis.a064;

import irvine.oeis.LinearRecurrence;

/**
 * A064617.
 * @author Sean A. Irvine
 */
public class A064617 extends LinearRecurrence {

  /** Construct the sequence. */
  public A064617() {
    super(new long[] {10, -21, 12}, new long[] {9, 98, 987});
  }
}
