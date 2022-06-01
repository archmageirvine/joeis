package irvine.oeis.a083;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A083880 a(0)=1, a(1)=5, a(n) = 10*a(n-1) - 23*a(n-2), n &gt;= 2.
 * @author Sean A. Irvine
 */
public class A083880 extends LinearRecurrence {

  /** Construct the sequence. */
  public A083880() {
    super(new long[] {-23, 10}, new long[] {1, 5});
  }
}
