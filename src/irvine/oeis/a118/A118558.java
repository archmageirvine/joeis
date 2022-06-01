package irvine.oeis.a118;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A118558 a(n) = (2^n-1)^4 - 2.
 * @author Sean A. Irvine
 */
public class A118558 extends LinearRecurrence {

  /** Construct the sequence. */
  public A118558() {
    super(new long[] {1024, -1984, 1240, -310, 31}, new long[] {-2, -1, 79, 2399, 50623});
  }
}
