package irvine.oeis.a168;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A168572 a(n) = Sum_{k=2..n}(7^k).
 * @author Sean A. Irvine
 */
public class A168572 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168572() {
    super(1, new long[] {-7, 8}, new long[] {0, 49});
  }
}
