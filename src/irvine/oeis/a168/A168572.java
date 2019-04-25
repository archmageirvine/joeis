package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168572 <code>a(n) = Sum_{k=2..n}(7^k)</code>.
 * @author Sean A. Irvine
 */
public class A168572 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168572() {
    super(new long[] {-7, 8}, new long[] {0, 49});
  }
}
