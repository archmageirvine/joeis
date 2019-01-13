package irvine.oeis.a152;

import irvine.oeis.LinearRecurrence;

/**
 * A152223.
 * @author Sean A. Irvine
 */
public class A152223 extends LinearRecurrence {

  /** Construct the sequence. */
  public A152223() {
    super(new long[] {6, -4}, new long[] {1, -6});
  }
}
