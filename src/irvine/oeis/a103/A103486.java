package irvine.oeis.a103;

import irvine.oeis.LinearRecurrence;

/**
 * A103486 <code>a(0)=7, a(1)=11, a(2)=13, a(3)=17</code>; then <code>a(n) = a(n-1)+a(n-3)-a(n-4)</code>.
 * @author Sean A. Irvine
 */
public class A103486 extends LinearRecurrence {

  /** Construct the sequence. */
  public A103486() {
    super(new long[] {-1, 1, 0, 1}, new long[] {7, 11, 13, 17});
  }
}
