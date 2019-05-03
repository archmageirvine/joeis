package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022018 Define the sequence <code>UD(a(0),a(1))</code> by <code>a(n)</code> is the least integer such that <code>a(n)/a(n-1) &gt; a(n-1)/a(n-2)+1</code> for even <code>n &gt;= 2</code> and such that <code>a(n)/a(n-1) &gt; a(n-1)/a(n-2)</code> for odd <code>n&gt;=2</code>. This is <code>UD(2,16)</code>.
 * @author Sean A. Irvine
 */
public class A022018 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022018() {
    super(new long[] {-4, 1, 8}, new long[] {2, 16, 129});
  }
}
