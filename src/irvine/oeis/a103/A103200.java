package irvine.oeis.a103;

import irvine.oeis.LinearRecurrence;

/**
 * A103200 <code>a(1)=1, a(2)=2, a(3)=11, a(4)=19; a(n) = a(n-4) + sqrt(60*a(n-2)^2 + 60*a(n-2) + 1)</code> for <code>n &gt;= 5</code>.
 * @author Sean A. Irvine
 */
public class A103200 extends LinearRecurrence {

  /** Construct the sequence. */
  public A103200() {
    super(new long[] {1, -1, -8, 8, 1}, new long[] {1, 2, 11, 19, 90});
  }
}
