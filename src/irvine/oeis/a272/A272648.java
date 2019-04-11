package irvine.oeis.a272;

import irvine.oeis.LinearRecurrence;

/**
 * A272648 <code>a(n) =</code> A002119(n) <code>mod 7</code>.
 * @author Sean A. Irvine
 */
public class A272648 extends LinearRecurrence {

  /** Construct the sequence. */
  public A272648() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 1, 0, 1, 0, 1, 1, 6, 6, 0, 6, 0, 6, 6});
  }
}
