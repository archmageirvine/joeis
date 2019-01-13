package irvine.oeis.a152;

import irvine.oeis.LinearRecurrence;

/**
 * A152775.
 * @author Sean A. Irvine
 */
public class A152775 extends LinearRecurrence {

  /** Construct the sequence. */
  public A152775() {
    super(new long[] {-1000, 1, 1000}, new long[] {111, 111000, 111000111});
  }
}
