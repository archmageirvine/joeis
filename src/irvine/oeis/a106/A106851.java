package irvine.oeis.a106;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A106851 Let M = {{0, 0, 0, 1}, {1, 4, 0, 0}, {0, 1, 0, 0}, {0, 0, 1, 4}}, v[1] = {0, 1, 1, 2}', v[n]=M.v[n-1]; then a(n) = v[n][[1]].
 * @author Sean A. Irvine
 */
public class A106851 extends LinearRecurrence {

  /** Construct the sequence. */
  public A106851() {
    super(new long[] {1, 0, -16, 8}, new long[] {0, 2, 9, 37});
  }
}
