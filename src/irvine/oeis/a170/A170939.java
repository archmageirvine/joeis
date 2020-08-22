package irvine.oeis.a170;

import irvine.oeis.LinearRecurrence;

/**
 * A170939 4^n-2^n+2.
 * @author Sean A. Irvine
 */
public class A170939 extends LinearRecurrence {

  /** Construct the sequence. */
  public A170939() {
    super(new long[] {8, -14, 7}, new long[] {2, 4, 14});
  }
}
