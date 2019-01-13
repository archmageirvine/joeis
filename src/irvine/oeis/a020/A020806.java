package irvine.oeis.a020;

import irvine.oeis.LinearRecurrence;

/**
 * A020806.
 * @author Sean A. Irvine
 */
public class A020806 extends LinearRecurrence {

  /** Construct the sequence. */
  public A020806() {
    super(new long[] {1, -1, 0, 1}, new long[] {1, 4, 2, 8});
  }
}
