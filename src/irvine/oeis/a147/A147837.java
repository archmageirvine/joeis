package irvine.oeis.a147;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A147837 a(n)=7*a(n-1)-5*a(n-2), a(0)=1, a(1)=5 .
 * @author Sean A. Irvine
 */
public class A147837 extends LinearRecurrence {

  /** Construct the sequence. */
  public A147837() {
    super(new long[] {-5, 7}, new long[] {1, 5});
  }
}
