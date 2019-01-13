package irvine.oeis.a177;

import irvine.oeis.LinearRecurrence;

/**
 * A177757.
 * @author Sean A. Irvine
 */
public class A177757 extends LinearRecurrence {

  /** Construct the sequence. */
  public A177757() {
    super(new long[] {1, -2, -6, 14, 14, -42, -14, 70, 0, -70, 14, 42, -14, -14, 6, 2}, new long[] {0, 0, 0, 64, 600, 6912, 29400, 132864, 381024, 1139200, 2613600, 6177600, 12269400, 24912384, 44717400, 81636352});
  }
}
