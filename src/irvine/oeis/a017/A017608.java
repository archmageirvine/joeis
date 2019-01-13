package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017608.
 * @author Sean A. Irvine
 */
public class A017608 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017608() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {2401, 130321, 923521, 3418801, 9150625});
  }
}
