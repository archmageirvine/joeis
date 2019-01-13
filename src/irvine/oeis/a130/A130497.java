package irvine.oeis.a130;

import irvine.oeis.LinearRecurrence;

/**
 * A130497.
 * @author Sean A. Irvine
 */
public class A130497 extends LinearRecurrence {

  /** Construct the sequence. */
  public A130497() {
    super(new long[] {-1, 1, 0, 0, 0, 1}, new long[] {1, 1, 1, 1, 1, 3});
  }
}
