package irvine.oeis.a074;

import irvine.oeis.LinearRecurrence;

/**
 * A074378.
 * @author Sean A. Irvine
 */
public class A074378 extends LinearRecurrence {

  /** Construct the sequence. */
  public A074378() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {0, 3, 5, 14, 18});
  }
}
