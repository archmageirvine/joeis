package irvine.oeis.a027;

import irvine.oeis.LinearRecurrence;

/**
 * A027934 <code>a(0)=0, a(1)=1, a(2)=2</code>; for <code>n &gt; 2, a(n) = 3*a(n-1) - a(n-2) - 2*a(n-3)</code>.
 * @author Sean A. Irvine
 */
public class A027934 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027934() {
    super(new long[] {-2, -1, 3}, new long[] {0, 1, 2});
  }
}
