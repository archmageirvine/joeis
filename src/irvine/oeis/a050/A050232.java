package irvine.oeis.a050;

import irvine.oeis.LinearRecurrence;

/**
 * A050232 <code>a(n)</code> is the number of n-tosses having a run of 4 or more heads for a fair coin <code>(i.e.</code>, probability is <code>a(n)/2^n)</code>.
 * @author Sean A. Irvine
 */
public class A050232 extends LinearRecurrence {

  /** Construct the sequence. */
  public A050232() {
    super(new long[] {-2, -1, -1, -1, 3}, new long[] {0, 0, 0, 1, 3});
  }
}
