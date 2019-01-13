package irvine.oeis.a152;

import irvine.oeis.LinearRecurrence;

/**
 * A152163.
 * @author Sean A. Irvine
 */
public class A152163 extends LinearRecurrence {

  /** Construct the sequence. */
  public A152163() {
    super(new long[] {1, 1}, new long[] {1, -1});
  }
}
