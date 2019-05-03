package irvine.oeis.a167;

import irvine.oeis.LinearRecurrence;

/**
 * A167821 <code>a(n)</code> is the number of n-tosses having a run of 3 or more heads or a run of 3 or more tails for a fair coin <code>(i.e.</code>, probability is <code>a(n)/2^n)</code>.
 * @author Sean A. Irvine
 */
public class A167821 extends LinearRecurrence {

  /** Construct the sequence. */
  public A167821() {
    super(new long[] {-2, -1, 3}, new long[] {0, 0, 2});
  }
}
