package irvine.oeis.a152;

import irvine.oeis.LinearRecurrence;

/**
 * A152949.
 * @author Sean A. Irvine
 */
public class A152949 extends LinearRecurrence {

  /** Construct the sequence. */
  public A152949() {
    super(new long[] {1, -3, 3}, new long[] {3, 3, 4});
  }
}
