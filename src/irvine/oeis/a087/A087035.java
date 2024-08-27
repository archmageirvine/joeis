package irvine.oeis.a087;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A087035 Maximum value taken on by f(P) = Sum_{i=1..n} p(i)*p(n+1-i) as {p(1),p(2),...,p(n)} ranges over all permutations P of {1,2,3,...,n}.
 * @author Sean A. Irvine
 */
public class A087035 extends LinearRecurrence {

  /** Construct the sequence. */
  public A087035() {
    super(0, new long[]{-1, 3, -2, -2, 3}, new long[]{1, 4, 13, 28, 53});
  }
}
