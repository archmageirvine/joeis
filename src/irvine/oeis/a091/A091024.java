package irvine.oeis.a091;

import irvine.oeis.LinearRecurrence;

/**
 * A091024 Let v(0) be the column vector <code>(1,0,0</code>,0)'; for <code>n&gt;0,</code> let v(n) <code>= [1 1 1 1 / 1 1 1 0 / 1 1 0 0/ 1 0 0 0]</code> v(n-1). Sequence gives third entry of v(n).
 * @author Sean A. Irvine
 */
public class A091024 extends LinearRecurrence {

  /** Construct the sequence. */
  public A091024() {
    super(new long[] {-1, -1, 3, 2}, new long[] {0, 1, 2, 7});
  }
}
