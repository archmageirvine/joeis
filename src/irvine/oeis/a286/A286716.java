package irvine.oeis.a286;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A286716 a(n) = floor(n/2) - floor((n+1)/5), n &gt;= 0.
 * @author Sean A. Irvine
 */
public class A286716 extends LinearRecurrence {

  /** Construct the sequence. */
  public A286716() {
    super(new long[] {-1, 0, 1, 0, 0, 1, 0}, new long[] {0, 0, 1, 1, 1, 1, 2});
  }
}
