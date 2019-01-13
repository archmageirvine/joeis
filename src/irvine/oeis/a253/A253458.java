package irvine.oeis.a253;

import irvine.oeis.LinearRecurrence;

/**
 * A253458.
 * @author Sean A. Irvine
 */
public class A253458 extends LinearRecurrence {

  /** Construct the sequence. */
  public A253458() {
    super(new long[] {1, -27, 27}, new long[] {1, 13, 325});
  }
}
