package irvine.oeis.a201;

import irvine.oeis.LinearRecurrence;

/**
 * A201003.
 * @author Sean A. Irvine
 */
public class A201003 extends LinearRecurrence {

  /** Construct the sequence. */
  public A201003() {
    super(new long[] {1, -323, 323}, new long[] {0, 36, 11628});
  }
}
