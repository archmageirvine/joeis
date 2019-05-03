package irvine.oeis.a091;

import irvine.oeis.LinearRecurrence;

/**
 * A091024 Let <code>v(0)</code> be the column vector <code>(1,0,0,0)'</code>; for <code>n&gt;0</code>, let <code>v(n) = [1 1 1 1 / 1 1 1 0 / 1 1 0 0/ 1 0 0 0] v(n-1)</code>. Sequence gives third entry of <code>v(n)</code>.
 * @author Sean A. Irvine
 */
public class A091024 extends LinearRecurrence {

  /** Construct the sequence. */
  public A091024() {
    super(new long[] {-1, -1, 3, 2}, new long[] {0, 1, 2, 7});
  }
}
