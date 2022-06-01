package irvine.oeis.a083;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A083879 a(0)=1, a(1)=4, a(n) = 8*a(n-1) - 14*a(n-2), n &gt;= 2.
 * @author Sean A. Irvine
 */
public class A083879 extends LinearRecurrence {

  /** Construct the sequence. */
  public A083879() {
    super(new long[] {-14, 8}, new long[] {1, 4});
  }
}
