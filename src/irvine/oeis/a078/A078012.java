package irvine.oeis.a078;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A078012 a(n) = a(n-1) + a(n-3) for n &gt;= 3, with a(0) = 1, a(1) = a(2) = 0. This recurrence can also be used to define a(n) for n &lt; 0.
 * @author Sean A. Irvine
 */
public class A078012 extends LinearRecurrence {

  /** Construct the sequence. */
  public A078012() {
    super(new long[] {1, 0, 1}, new long[] {1, 0, 0});
  }
}
