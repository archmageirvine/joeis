package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017223.
 * @author Sean A. Irvine
 */
public class A017223 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017223() {
    super(new long[] {-1, 4, -6, 4}, new long[] {125, 2744, 12167, 32768});
  }
}
