package irvine.oeis.a020;

import irvine.oeis.LinearRecurrence;

/**
 * A020705 n+4.
 * @author Sean A. Irvine
 */
public class A020705 extends LinearRecurrence {

  /** Construct the sequence. */
  public A020705() {
    super(new long[] {-1, 2}, new long[] {4, 5});
  }
}
