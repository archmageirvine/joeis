package irvine.oeis.a060;

import irvine.oeis.LinearRecurrence;

/**
 * A060919 Number of corners in a 4-sided fractal.
 * @author Sean A. Irvine
 */
public class A060919 extends LinearRecurrence {

  /** Construct the sequence. */
  public A060919() {
    super(new long[] {8, -14, 7}, new long[] {4, 8, 20});
  }
}
