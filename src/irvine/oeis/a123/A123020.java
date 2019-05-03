package irvine.oeis.a123;

import irvine.oeis.LinearRecurrence;

/**
 * A123020 Let M <code>= {{1, 1, 0, 0}, {1, 2, 1, 1}, {0, 1, 2, 1}, {0, 0, 1, 2}}, v[1] = {1, 0, 0, 0}, v[n] = M.v[n - 1]</code>. Then <code>a(n) = v[n][[1]]</code>.
 * @author Sean A. Irvine
 */
public class A123020 extends LinearRecurrence {

  /** Construct the sequence. */
  public A123020() {
    super(new long[] {2, -9, 6}, new long[] {1, 1, 2});
  }
}
