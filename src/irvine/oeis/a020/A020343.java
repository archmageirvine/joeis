package irvine.oeis.a020;

import irvine.oeis.LinearRecurrence;

/**
 * A020343.
 * @author Sean A. Irvine
 */
public class A020343 extends LinearRecurrence {

  /** Construct the sequence. */
  public A020343() {
    super(new long[] {360, -157, 22}, new long[] {1, 22, 327});
  }
}
