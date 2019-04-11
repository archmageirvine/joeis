package irvine.oeis.a087;

import irvine.oeis.LinearRecurrence;

/**
 * A087035 Maximum value taken on by f(P)=sum(i=1..n, p(i)*p(n+1-i) ) as {p(1),p(2),...,p(n)} ranges over all permutations P of <code>{1,2,3,...n}</code>.
 * @author Sean A. Irvine
 */
public class A087035 extends LinearRecurrence {

  /** Construct the sequence. */
  public A087035() {
    super(new long[] {-1, 3, -2, -2, 3}, new long[] {1, 4, 13, 28, 53});
  }
}
