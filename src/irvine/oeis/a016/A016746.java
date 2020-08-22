package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016746 a(n) = (2*n)^6.
 * @author Sean A. Irvine
 */
public class A016746 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016746() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {0, 64, 4096, 46656, 262144, 1000000, 2985984});
  }
}
