package irvine.oeis.a130;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A130013 Nonnegative values x of solutions (x, y) to the Diophantine equation x^2+(x+647)^2 = y^2.
 * @author Sean A. Irvine
 */
public class A130013 extends LinearRecurrence {

  /** Construct the sequence. */
  public A130013() {
    super(1, new long[] {1, -1, 0, -6, 6, 0, 1}, new long[] {0, 37, 1768, 1941, 2128, 11937, 12940});
  }
}
