package irvine.oeis.a111;

import irvine.oeis.LinearRecurrence;

/**
 * A111080.
 * @author Sean A. Irvine
 */
public class A111080 extends LinearRecurrence {

  /** Construct the sequence. */
  public A111080() {
    super(new long[] {-1, 4, -6, 4}, new long[] {11, 44, 110, 220});
  }
}
