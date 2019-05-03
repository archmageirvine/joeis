package irvine.oeis.a272;

import irvine.oeis.LinearRecurrence;

/**
 * A272000 Coinage sequence: <code>a(n) = A018227(n)-7</code>.
 * @author Sean A. Irvine
 */
public class A272000 extends LinearRecurrence {

  /** Construct the sequence. */
  public A272000() {
    super(new long[] {-1, 2, 1, -4, 1, 2}, new long[] {3, 11, 29, 47, 79, 111});
  }
}
