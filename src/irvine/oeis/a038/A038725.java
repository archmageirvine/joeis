package irvine.oeis.a038;

import irvine.oeis.LinearRecurrence;

/**
 * A038725 a(n) = 6a(n-1) - a(n-2), n &gt;= 2, a(0)=1, a(1)=2.
 * @author Sean A. Irvine
 */
public class A038725 extends LinearRecurrence {

  /** Construct the sequence. */
  public A038725() {
    super(new long[] {-1, 6}, new long[] {1, 2});
  }
}
