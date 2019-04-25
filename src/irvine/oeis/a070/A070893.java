package irvine.oeis.a070;

import irvine.oeis.LinearRecurrence;

/**
 * A070893 Let r, s, t be three permutations of the set <code>{1,2,3,..,n}</code>; <code>a(n)=</code> value of <code>sum_{i=1..n}</code> r(i)*s(i)*t(i), with r={1,2,3,..,n}; s={n,n-1,..,1} and t={n,n-2,n-4,...,1,...,n-3,n-1}.
 * @author Sean A. Irvine
 */
public class A070893 extends LinearRecurrence {

  /** Construct the sequence. */
  public A070893() {
    super(new long[] {1, -4, 5, 0, -5, 4}, new long[] {1, 6, 19, 46, 94, 172});
  }
}
