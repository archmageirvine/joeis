package irvine.oeis.a271;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A271324 a(n) = n + floor(n/4) + (n mod 4).
 * @author Sean A. Irvine
 */
public class A271324 extends LinearRecurrence {

  /** Construct the sequence. */
  public A271324() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {0, 2, 4, 6, 5});
  }
}
