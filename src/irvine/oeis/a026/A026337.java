package irvine.oeis.a026;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A026337 a(n) = 4^n*(4^n - 1)/2.
 * @author Sean A. Irvine
 */
public class A026337 extends LinearRecurrence {

  /** Construct the sequence. */
  public A026337() {
    super(new long[] {-64, 20}, new long[] {0, 6});
  }
}
