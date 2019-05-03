package irvine.oeis.a070;

import irvine.oeis.LinearRecurrence;

/**
 * A070893 Let r, s, t be three permutations of the set <code>{1,2,3,..,n}; a(n) =</code> value of <code>Sum_{i=1..n} r(i)*s(i)*t(i)</code>, with <code>r={1,2,3,..,n}; s={n,n-1,..,1}</code> and <code>t={n,n-2,n-4,...,1,...,n-3,n-1}</code>.
 * @author Sean A. Irvine
 */
public class A070893 extends LinearRecurrence {

  /** Construct the sequence. */
  public A070893() {
    super(new long[] {1, -4, 5, 0, -5, 4}, new long[] {1, 6, 19, 46, 94, 172});
  }
}
