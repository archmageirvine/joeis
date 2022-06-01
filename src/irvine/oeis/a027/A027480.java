package irvine.oeis.a027;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A027480 a(n) = n*(n+1)*(n+2)/2.
 * @author Sean A. Irvine
 */
public class A027480 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027480() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 3, 12, 30});
  }
}
