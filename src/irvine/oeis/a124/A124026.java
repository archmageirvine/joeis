package irvine.oeis.a124;

import irvine.oeis.LinearRecurrence;

/**
 * A124026 Let M <code>= {{0, -1, 2}, {-1, 2, -1}, {2, -1, 0}}; v[1] = {0, 0, 1}; v[n] = M.v[n - 1]</code>; then <code>a(n) = v[n][[1]]</code>.
 * @author Sean A. Irvine
 */
public class A124026 extends LinearRecurrence {

  /** Construct the sequence. */
  public A124026() {
    super(new long[] {-4, 6, 2}, new long[] {0, 2, 1});
  }
}
