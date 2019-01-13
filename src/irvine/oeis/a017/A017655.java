package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017655.
 * @author Sean A. Irvine
 */
public class A017655 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017655() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1331, 12167, 42875, 103823});
  }
}
