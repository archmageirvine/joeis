package irvine.oeis.a070;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A070893 Let r, s, t be three permutations of the set {1,2,3,..,n}; a(n) = value of Sum_{i=1..n} r(i)*s(i)*t(i), with r={1,2,3,..,n}; s={n,n-1,..,1} and t={n,n-2,n-4,...,1,...,n-3,n-1}.
 * @author Sean A. Irvine
 */
public class A070893 extends LinearRecurrence {

  /** Construct the sequence. */
  public A070893() {
    super(1, new long[] {1, -4, 5, 0, -5, 4}, new long[] {1, 6, 19, 46, 94, 172});
  }
}
