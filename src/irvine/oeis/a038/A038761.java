package irvine.oeis.a038;

import irvine.oeis.LinearRecurrence;

/**
 * A038761 <code>a(n) = 6*a(n-1)-a(n-2), n &gt;= 2, a(0)=1, a(1)=9</code>.
 * @author Sean A. Irvine
 */
public class A038761 extends LinearRecurrence {

  /** Construct the sequence. */
  public A038761() {
    super(new long[] {-1, 6}, new long[] {1, 9});
  }
}
