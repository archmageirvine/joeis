package irvine.oeis.a070;

import irvine.oeis.LinearRecurrence;

/**
 * A070998 <code>a(n) = 9*a(n-1) - a(n-2)</code> for <code>n &gt; 0, a(0)=1, a(-1)=1</code>.
 * @author Sean A. Irvine
 */
public class A070998 extends LinearRecurrence {

  /** Construct the sequence. */
  public A070998() {
    super(new long[] {-1, 9}, new long[] {1, 8});
  }
}
