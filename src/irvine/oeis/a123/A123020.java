package irvine.oeis.a123;

import irvine.oeis.LinearRecurrence;

/**
 * A123020 Let M = {{1, 1, 0, 0}, {1, 2, 1, 1}, {0, 1, 2, 1}, {0, 0, 1, 2}}, v[1] = {1, 0, 0, 0}, v[n] = M.v[n - 1]. Then a(n) = v[n][[1]].
 * @author Sean A. Irvine
 */
public class A123020 extends LinearRecurrence {

  /** Construct the sequence. */
  public A123020() {
    super(new long[] {2, -9, 6}, new long[] {1, 1, 2});
  }
}
