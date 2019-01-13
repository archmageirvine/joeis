package irvine.oeis.a174;

import irvine.oeis.LinearRecurrence;

/**
 * A174994.
 * @author Sean A. Irvine
 */
public class A174994 extends LinearRecurrence {

  /** Construct the sequence. */
  public A174994() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {16, 16, 144, 144, 400});
  }
}
