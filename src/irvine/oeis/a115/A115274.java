package irvine.oeis.a115;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A115274 a(n) = n + A115273(n), where A115273(n) = 0 for n = 1..3.
 * @author Sean A. Irvine
 */
public class A115274 extends LinearRecurrence {

  /** Construct the sequence. */
  public A115274() {
    super(new long[] {-1, 0, 0, 2, 0, 0}, new long[] {1, 2, 3, 5, 7, 6});
  }
}
