package irvine.oeis.a083;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A083878 a(0)=1, a(1)=3, a(n) = 6*a(n-1) - 7*a(n-2), n &gt;= 2.
 * @author Sean A. Irvine
 */
public class A083878 extends LinearRecurrence {

  /** Construct the sequence. */
  public A083878() {
    super(new long[] {-7, 6}, new long[] {1, 3});
  }
}
