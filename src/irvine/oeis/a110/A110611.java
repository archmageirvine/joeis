package irvine.oeis.a110;

import irvine.oeis.LinearRecurrence;

/**
 * A110611 Minimal value of sum(p(i)p(i+1),i=1..n), where p(n+1)=p(1), as p ranges over all permutations of <code>{1,2,...,n}</code>.
 * @author Sean A. Irvine
 */
public class A110611 extends LinearRecurrence {

  /** Construct the sequence. */
  public A110611() {
    super(new long[] {-1, 3, -2, -2, 3}, new long[] {1, 4, 11, 21, 37});
  }
}
