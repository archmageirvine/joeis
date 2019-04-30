package irvine.oeis.a200;

import irvine.oeis.LinearRecurrence;

/**
 * A200310 <code>a(n) = n-1</code> for <code>n &lt;= 4</code>, otherwise if n is even then <code>a(n) = a(n-5)+2^(n/2)</code>, and if n is odd then <code>a(n) = a(n-1)+2^((n-3)/2)</code>.
 * @author Sean A. Irvine
 */
public class A200310 extends LinearRecurrence {

  /** Construct the sequence. */
  public A200310() {
    super(new long[] {-2, 2, -1, 1, -1, 1, 1}, new long[] {0, 1, 2, 3, 5, 8, 12});
  }
}
