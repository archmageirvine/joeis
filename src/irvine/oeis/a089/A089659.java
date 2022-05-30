package irvine.oeis.a089;

import irvine.oeis.LinearRecurrence;

/**
 * A089659 a(n) = S1(n,2), where S1(n, t) = Sum_{k=0..n} (k^t * Sum_{j=0..k} binomial(n,j)).
 * @author Sean A. Irvine
 */
public class A089659 extends LinearRecurrence {

  /** Construct the sequence. */
  public A089659() {
    super(new long[] {-16, 32, -24, 8}, new long[] {0, 2, 19, 104});
  }
}
