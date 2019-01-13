package irvine.oeis.a152;

import irvine.oeis.LinearRecurrence;

/**
 * A152691.
 * @author Sean A. Irvine
 */
public class A152691 extends LinearRecurrence {

  /** Construct the sequence. */
  public A152691() {
    super(new long[] {-1, 2}, new long[] {0, 64});
  }
}
