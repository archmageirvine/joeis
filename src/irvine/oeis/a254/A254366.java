package irvine.oeis.a254;

import irvine.oeis.LinearRecurrence;

/**
 * A254366.
 * @author Sean A. Irvine
 */
public class A254366 extends LinearRecurrence {

  /** Construct the sequence. */
  public A254366() {
    super(new long[] {-24, 50, -35, 10}, new long[] {35, 56, 112, 272});
  }
}
