package irvine.oeis.a128;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A128988 a(n) = (n^3 - n^2)*5^n.
 * @author Sean A. Irvine
 */
public class A128988 extends LinearRecurrence {

  /** Construct the sequence. */
  public A128988() {
    super(1, new long[] {-625, 500, -150, 20}, new long[] {0, 100, 2250, 30000});
  }
}
