package irvine.oeis.a184;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A184337 a(n) is the integer whose decimal representation consists of n 8's followed by n 1's.
 * @author Sean A. Irvine
 */
public class A184337 extends LinearRecurrence {

  /** Construct the sequence. */
  public A184337() {
    super(new long[] {1000, -1110, 111}, new long[] {0, 81, 8811});
  }
}
