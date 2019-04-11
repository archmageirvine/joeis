package irvine.oeis.a133;

import irvine.oeis.LinearRecurrence;

/**
 * A133467 <code>a(n) = a(n-1) + 6*a(n-2)</code> for <code>n &gt;= 2, a(0)=1, a(1)=2</code>.
 * @author Sean A. Irvine
 */
public class A133467 extends LinearRecurrence {

  /** Construct the sequence. */
  public A133467() {
    super(new long[] {6, 1}, new long[] {1, 2});
  }
}
