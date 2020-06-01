package irvine.oeis.a079;

import irvine.oeis.LinearRecurrence;

/**
 * A079262 Octanacci numbers: <code>a(0)=a(1)=...=a(6)=0, a(7)=1;</code> for <code>n &gt;= 8, a(n) = Sum_{i=1..8} a(n-i)</code>.
 * @author Sean A. Irvine
 */
public class A079262 extends LinearRecurrence {

  /** Construct the sequence. */
  public A079262() {
    super(new long[] {1, 1, 1, 1, 1, 1, 1, 1}, new long[] {0, 0, 0, 0, 0, 0, 0, 1});
  }
}
