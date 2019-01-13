package irvine.oeis.a201;

import irvine.oeis.LinearRecurrence;

/**
 * A201200.
 * @author Sean A. Irvine
 */
public class A201200 extends LinearRecurrence {

  /** Construct the sequence. */
  public A201200() {
    super(new long[] {44, 64, -68, 16}, new long[] {1, 4, 30, 256});
  }
}
