package irvine.oeis.a089;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A089658 a(n) = S1(n,1), where S1(n, t) = Sum_{k=0..n} (k^t * Sum_{j=0..k} binomial(n,j)).
 * @author Sean A. Irvine
 */
public class A089658 extends LinearRecurrence {

  /** Construct the sequence. */
  public A089658() {
    super(new long[] {8, -12, 6}, new long[] {0, 2, 11});
  }
}
