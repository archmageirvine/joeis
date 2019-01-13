package irvine.oeis.a137;

import irvine.oeis.LinearRecurrence;

/**
 * A137444.
 * @author Sean A. Irvine
 */
public class A137444 extends LinearRecurrence {

  /** Construct the sequence. */
  public A137444() {
    super(new long[] {-2, 2}, new long[] {1, 4});
  }
}
