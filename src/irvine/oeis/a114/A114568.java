package irvine.oeis.a114;

import irvine.oeis.LinearRecurrence;

/**
 * A114568 <code>a(n) = 4694*a(n-2) + 9380*a(n-3)</code> for <code>n &gt;= 3</code> with <code>a(0) = 0</code> and <code>a(1) = a(2) = 1</code>.
 * @author Sean A. Irvine
 */
public class A114568 extends LinearRecurrence {

  /** Construct the sequence. */
  public A114568() {
    super(new long[] {9380, 4694, 0}, new long[] {0, 1, 1});
  }
}
