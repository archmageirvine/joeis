package irvine.oeis.a020;

import irvine.oeis.LinearRecurrence;

/**
 * A020532.
 * @author Sean A. Irvine
 */
public class A020532 extends LinearRecurrence {

  /** Construct the sequence. */
  public A020532() {
    super(new long[] {512, -336, 42}, new long[] {8, 70, 1292});
  }
}
