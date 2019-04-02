package irvine.oeis.a023;

import irvine.oeis.LinearRecurrence;

/**
 * A023439 Dying rabbits: a(n) = a(n-1) + a(n-2) - a(n-9).
 * @author Sean A. Irvine
 */
public class A023439 extends LinearRecurrence {

  /** Construct the sequence. */
  public A023439() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 1, 1}, new long[] {0, 1, 1, 2, 3, 5, 8, 13, 21});
  }
}
