package irvine.oeis.a108;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A108752 Numbers k such that 12 divides k*(k+1).
 * @author Sean A. Irvine
 */
public class A108752 extends LinearRecurrence {

  /** Construct the sequence. */
  public A108752() {
    super(new long[] {-1, 2, -2, 2}, new long[] {0, 3, 8, 11});
  }
}
