package irvine.oeis.a133;

import irvine.oeis.LinearRecurrence;

/**
 * A133416.
 * @author Sean A. Irvine
 */
public class A133416 extends LinearRecurrence {

  /** Construct the sequence. */
  public A133416() {
    super(new long[] {400, -3065, 2286, -483, 38}, new long[] {0, 0, 1, 91, 3060});
  }
}
