package irvine.oeis.a124;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A124388 27*n+18.
 * @author Sean A. Irvine
 */
public class A124388 extends LinearRecurrence {

  /** Construct the sequence. */
  public A124388() {
    super(new long[] {-1, 2}, new long[] {18, 45});
  }
}
