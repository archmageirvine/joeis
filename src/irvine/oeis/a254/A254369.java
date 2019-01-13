package irvine.oeis.a254;

import irvine.oeis.LinearRecurrence;

/**
 * A254369.
 * @author Sean A. Irvine
 */
public class A254369 extends LinearRecurrence {

  /** Construct the sequence. */
  public A254369() {
    super(new long[] {-24, 50, -35, 10}, new long[] {56, 84, 156, 354});
  }
}
