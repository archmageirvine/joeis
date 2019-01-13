package irvine.oeis.a130;

import irvine.oeis.LinearRecurrence;

/**
 * A130014.
 * @author Sean A. Irvine
 */
public class A130014 extends LinearRecurrence {

  /** Construct the sequence. */
  public A130014() {
    super(new long[] {1, -1, 0, -6, 6, 0, 1}, new long[] {0, 43, 2440, 2643, 2860, 16443, 17620});
  }
}
