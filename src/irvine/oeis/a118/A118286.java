package irvine.oeis.a118;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A118286 Numbers n such that n == 0 (mod 4) or n == 2 (mod 12).
 * @author Sean A. Irvine
 */
public class A118286 extends LinearRecurrence {

  /** Construct the sequence. */
  public A118286() {
    super(1, new long[] {-1, 2, -2, 2}, new long[] {2, 4, 8, 12});
  }
}
