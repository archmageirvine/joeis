package irvine.oeis.a147;

import irvine.oeis.LinearRecurrence;

/**
 * A147587 <code>a(n) = 14*n + 7</code>.
 * @author Sean A. Irvine
 */
public class A147587 extends LinearRecurrence {

  /** Construct the sequence. */
  public A147587() {
    super(new long[] {-1, 2}, new long[] {7, 21});
  }
}
