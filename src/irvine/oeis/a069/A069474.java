package irvine.oeis.a069;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A069474 First differences of A069473.
 * @author Sean A. Irvine
 */
public class A069474 extends LinearRecurrence {

  /** Construct the sequence. */
  public A069474() {
    super(new long[] {-1, 4, -6, 4}, new long[] {540, 2100, 5460, 11340});
  }
}
