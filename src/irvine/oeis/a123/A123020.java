package irvine.oeis.a123;

import irvine.oeis.LinearRecurrence;

/**
 * A123020 Let M <code>= {{1, 1, 0, 0}, {1, 2, 1, 1}, {0, 1, 2, 1}, {0, 0, 1, 2}},</code> v[1] <code>= {1, 0, 0, 0},</code> v[n] = M.v[n <code>- 1]</code>. Then <code>a(n) =</code> v[n][[1]].
 * @author Sean A. Irvine
 */
public class A123020 extends LinearRecurrence {

  /** Construct the sequence. */
  public A123020() {
    super(new long[] {2, -9, 6}, new long[] {1, 1, 2});
  }
}
