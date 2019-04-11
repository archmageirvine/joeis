package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168526 <code>a(n) = n^6*(n + 1)/2</code>.
 * @author Sean A. Irvine
 */
public class A168526 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168526() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {0, 1, 96, 1458, 10240, 46875, 163296, 470596});
  }
}
