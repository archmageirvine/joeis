package irvine.oeis.a118;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A118263 a(3n) = 2^n, a(3n+1) = 3^n, a(3n+2) = 4^n.
 * @author Sean A. Irvine
 */
public class A118263 extends LinearRecurrence {

  /** Construct the sequence. */
  public A118263() {
    super(new long[] {24, 0, 0, -26, 0, 0, 9, 0, 0}, new long[] {1, 1, 1, 2, 3, 4, 4, 9, 16});
  }
}
