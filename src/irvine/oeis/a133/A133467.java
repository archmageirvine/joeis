package irvine.oeis.a133;

import irvine.oeis.LinearRecurrence;

/**
 * A133467 a(n) = a(n-1) + 6*a(n-2) for n &gt;= 2, a(0)=1, a(1)=2.
 * @author Sean A. Irvine
 */
public class A133467 extends LinearRecurrence {

  /** Construct the sequence. */
  public A133467() {
    super(new long[] {6, 1}, new long[] {1, 2});
  }
}
