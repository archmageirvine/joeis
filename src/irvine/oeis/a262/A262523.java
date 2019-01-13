package irvine.oeis.a262;

import irvine.oeis.LinearRecurrence;

/**
 * A262523.
 * @author Sean A. Irvine
 */
public class A262523 extends LinearRecurrence {

  /** Construct the sequence. */
  public A262523() {
    super(new long[] {1, -2, 1, -1, 2}, new long[] {0, 2, 7, 13, 21});
  }
}
