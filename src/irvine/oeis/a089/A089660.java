package irvine.oeis.a089;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A089660 a(n) = S1(n,3), where S1(n, t) = Sum_{k=0..n} (k^t * Sum_{j=0..k} binomial(n,j)).
 * @author Sean A. Irvine
 */
public class A089660 extends LinearRecurrence {

  /** Construct the sequence. */
  public A089660() {
    super(new long[] {32, -80, 80, -40, 10}, new long[] {0, 2, 35, 276, 1522});
  }
}
