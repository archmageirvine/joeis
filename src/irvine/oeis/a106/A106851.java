package irvine.oeis.a106;

import irvine.oeis.LinearRecurrence;

/**
 * A106851 Let M <code>= {{0, 0, 0, 1}, {1, 4, 0, 0}, {0, 1, 0, 0}, {0, 0, 1, 4}},</code> v[1] <code>= {0, 1, 1,</code> 2}', v[n]=M.v[n-1]; then <code>a(n) =</code> v[n][[1]].
 * @author Sean A. Irvine
 */
public class A106851 extends LinearRecurrence {

  /** Construct the sequence. */
  public A106851() {
    super(new long[] {1, 0, -16, 8}, new long[] {0, 2, 9, 37});
  }
}
