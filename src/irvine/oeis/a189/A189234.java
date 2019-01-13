package irvine.oeis.a189;

import irvine.oeis.LinearRecurrence;

/**
 * A189234.
 * @author Sean A. Irvine
 */
public class A189234 extends LinearRecurrence {

  /** Construct the sequence. */
  public A189234() {
    super(new long[] {1, -3, -3, 4, 1}, new long[] {5, 1, 9, 4, 25});
  }
}
