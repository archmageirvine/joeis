package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042306.
 * @author Sean A. Irvine
 */
public class A042306 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042306() {
    super(new long[] {-1, 0, 678, 0}, new long[] {26, 339, 17654, 229841});
  }
}
