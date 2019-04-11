package irvine.oeis.a124;

import irvine.oeis.LinearRecurrence;

/**
 * A124026 Let M <code>= {{0, -1, 2}, {-1, 2, -1}, {2, -1, 0}}</code>; v[1] <code>= {0, 0, 1}</code>; v[n] = M.v[n <code>- 1]</code>; then <code>a(n) =</code> v[n][[1]].
 * @author Sean A. Irvine
 */
public class A124026 extends LinearRecurrence {

  /** Construct the sequence. */
  public A124026() {
    super(new long[] {-4, 6, 2}, new long[] {0, 2, 1});
  }
}
