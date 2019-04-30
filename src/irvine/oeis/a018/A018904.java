package irvine.oeis.a018;

import irvine.oeis.LinearRecurrence;

/**
 * A018904 Define the sequence <code>S(a(0),a(1)) by a(n+2)</code> is the least integer such that <code>a(n+2)/a(n+1) &gt; a(n+1)/a(n)</code> for <code>n &gt;= 0</code>. This is <code>S(1,6)</code>.
 * @author Sean A. Irvine
 */
public class A018904 extends LinearRecurrence {

  /** Construct the sequence. */
  public A018904() {
    super(new long[] {-5, 7}, new long[] {1, 6});
  }
}
