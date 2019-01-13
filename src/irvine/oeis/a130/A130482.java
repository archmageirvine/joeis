package irvine.oeis.a130;

import irvine.oeis.LinearRecurrence;

/**
 * A130482.
 * @author Sean A. Irvine
 */
public class A130482 extends LinearRecurrence {

  /** Construct the sequence. */
  public A130482() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {0, 1, 3, 6, 6});
  }
}
