package irvine.oeis.a147;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A147840 a(n)=10*a(n-1)-8*a(n-2), a(0)=1, a(1)=8 .
 * @author Sean A. Irvine
 */
public class A147840 extends LinearRecurrence {

  /** Construct the sequence. */
  public A147840() {
    super(new long[] {-8, 10}, new long[] {1, 8});
  }
}
