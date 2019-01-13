package irvine.oeis.a266;

import irvine.oeis.LinearRecurrence;

/**
 * A266800.
 * @author Sean A. Irvine
 */
public class A266800 extends LinearRecurrence {

  /** Construct the sequence. */
  public A266800() {
    super(new long[] {1, -5, -15, 15, 5}, new long[] {-8, -12, -98, -636, -4424});
  }
}
