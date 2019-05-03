package irvine.oeis.a018;

import irvine.oeis.LinearRecurrence;

/**
 * A018903 Define the sequence <code>S(a(0),a(1))</code> by <code>a(n+2)</code> is the least integer such that <code>a(n+2)/a(n+1) &gt; a(n+1)/a(n)</code> for <code>n &gt;= 0</code>. This is <code>S(1,5)</code>.
 * @author Sean A. Irvine
 */
public class A018903 extends LinearRecurrence {

  /** Construct the sequence. */
  public A018903() {
    super(new long[] {-4, 6}, new long[] {1, 5});
  }
}
