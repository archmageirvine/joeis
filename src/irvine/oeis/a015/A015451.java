package irvine.oeis.a015;

import irvine.oeis.LinearRecurrence;

/**
 * A015451 <code>a(n) = 6*a(n-1) + a(n-2)</code> for <code>n &gt; 1</code>, with <code>a(0) = a(1) = 1</code>.
 * @author Sean A. Irvine
 */
public class A015451 extends LinearRecurrence {

  /** Construct the sequence. */
  public A015451() {
    super(new long[] {1, 6}, new long[] {1, 1});
  }
}
