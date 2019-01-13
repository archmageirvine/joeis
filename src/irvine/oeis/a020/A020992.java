package irvine.oeis.a020;

import irvine.oeis.LinearRecurrence;

/**
 * A020992.
 * @author Sean A. Irvine
 */
public class A020992 extends LinearRecurrence {

  /** Construct the sequence. */
  public A020992() {
    super(new long[] {1, 1, 1}, new long[] {0, 2, 1});
  }
}
