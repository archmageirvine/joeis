package irvine.oeis.a115;

import irvine.oeis.LinearRecurrence;

/**
 * A115274 <code>a(n) = n +</code> A115273(n), where A115273(n) <code>= 0</code> for <code>n = 1..3</code>.
 * @author Sean A. Irvine
 */
public class A115274 extends LinearRecurrence {

  /** Construct the sequence. */
  public A115274() {
    super(new long[] {-1, 0, 0, 2, 0, 0}, new long[] {1, 2, 3, 5, 7, 6});
  }
}
