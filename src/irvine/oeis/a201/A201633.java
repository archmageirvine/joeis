package irvine.oeis.a201;

import irvine.oeis.LinearRecurrence;

/**
 * A201633.
 * @author Sean A. Irvine
 */
public class A201633 extends LinearRecurrence {

  /** Construct the sequence. */
  public A201633() {
    super(new long[] {1, -1, -34, 34, 1}, new long[] {11, 28, 424, 1001, 14453});
  }
}
