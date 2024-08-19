package irvine.oeis.a128;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A128791 a(n) = n^3 * 5^n.
 * @author Sean A. Irvine
 */
public class A128791 extends LinearRecurrence {

  /** Construct the sequence. */
  public A128791() {
    super(new long[] {-625, 500, -150, 20}, new long[] {0, 5, 200, 3375});
  }
}
