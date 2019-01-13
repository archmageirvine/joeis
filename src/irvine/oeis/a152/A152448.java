package irvine.oeis.a152;

import irvine.oeis.LinearRecurrence;

/**
 * A152448.
 * @author Sean A. Irvine
 */
public class A152448 extends LinearRecurrence {

  /** Construct the sequence. */
  public A152448() {
    super(new long[] {-1, 0, 10, 0}, new long[] {1, 1, 6, 11});
  }
}
