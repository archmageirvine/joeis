package irvine.oeis.a130;

import irvine.oeis.LinearRecurrence;

/**
 * A130205.
 * @author Sean A. Irvine
 */
public class A130205 extends LinearRecurrence {

  /** Construct the sequence. */
  public A130205() {
    super(new long[] {1, -2, 1, -1, 2}, new long[] {1, 2, 6, 8, 11});
  }
}
