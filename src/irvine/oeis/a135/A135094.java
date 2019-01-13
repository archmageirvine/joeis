package irvine.oeis.a135;

import irvine.oeis.LinearRecurrence;

/**
 * A135094.
 * @author Sean A. Irvine
 */
public class A135094 extends LinearRecurrence {

  /** Construct the sequence. */
  public A135094() {
    super(new long[] {-4, 2, 2}, new long[] {0, 1, 3});
  }
}
