package irvine.oeis.a152;

import irvine.oeis.LinearRecurrence;

/**
 * A152467 a(n) = floor(n/6).
 * @author Sean A. Irvine
 */
public class A152467 extends LinearRecurrence {

  /** Construct the sequence. */
  public A152467() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 1}, new long[] {0, 0, 0, 0, 0, 0, 1});
  }
}
