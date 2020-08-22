package irvine.oeis.a135;

import irvine.oeis.LinearRecurrence;

/**
 * A135851 If n &lt;= 1 then n-1 otherwise A107458(n-1) + A107458(n-2).
 * @author Sean A. Irvine
 */
public class A135851 extends LinearRecurrence {

  /** Construct the sequence. */
  public A135851() {
    super(new long[] {1, 0, 1}, new long[] {-1, 0, 1});
  }
}
