package irvine.oeis.a003;

import irvine.oeis.LinearRecurrence;

/**
 * A003499 a(0) = 2, a(1) = 6; for n &gt;= 2, a(n) = 6*a(n-1) - a(n-2).
 * @author Sean A. Irvine
 */
public class A003499 extends LinearRecurrence {

  /** Construct the sequence. */
  public A003499() {
    super(new long[] {-1, 6}, new long[] {2, 6});
  }
}

