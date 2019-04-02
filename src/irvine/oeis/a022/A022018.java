package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022018 Define the sequence UD(a(0),a(1)) by a(n) is the least integer such that a(n)/a(n-1) &gt; a(n-1)/a(n-2)+1 for even n &gt;= 2 and such that a(n)/a(n-1) &gt; a(n-1)/a(n-2) for odd n&gt;=2. This is UD(2,16).
 * @author Sean A. Irvine
 */
public class A022018 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022018() {
    super(new long[] {-4, 1, 8}, new long[] {2, 16, 129});
  }
}
