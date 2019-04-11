package irvine.oeis.a135;

import irvine.oeis.LinearRecurrence;

/**
 * A135851 If <code>n &lt;= 1</code> then <code>n-1</code> otherwise A107458(n-1) + A107458(n-2).
 * @author Sean A. Irvine
 */
public class A135851 extends LinearRecurrence {

  /** Construct the sequence. */
  public A135851() {
    super(new long[] {1, 0, 1}, new long[] {-1, 0, 1});
  }
}
