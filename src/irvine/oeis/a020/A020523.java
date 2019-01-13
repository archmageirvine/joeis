package irvine.oeis.a020;

import irvine.oeis.LinearRecurrence;

/**
 * A020523.
 * @author Sean A. Irvine
 */
public class A020523 extends LinearRecurrence {

  /** Construct the sequence. */
  public A020523() {
    super(new long[] {32, -44, 13}, new long[] {-1, 9, 161});
  }
}
