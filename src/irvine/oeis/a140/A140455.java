package irvine.oeis.a140;

import irvine.oeis.LinearRecurrence;

/**
 * A140455 13-Fibonacci sequence.
 * @author Sean A. Irvine
 */
public class A140455 extends LinearRecurrence {

  /** Construct the sequence. */
  public A140455() {
    super(new long[] {1, 13}, new long[] {0, 1});
  }
}
