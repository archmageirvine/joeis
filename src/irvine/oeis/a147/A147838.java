package irvine.oeis.a147;

import irvine.oeis.LinearRecurrence;

/**
 * A147838 a(n)=8*a(n-1)-6*a(n-2), a(0)=1, a(1)=6 .
 * @author Sean A. Irvine
 */
public class A147838 extends LinearRecurrence {

  /** Construct the sequence. */
  public A147838() {
    super(new long[] {-6, 8}, new long[] {1, 6});
  }
}
