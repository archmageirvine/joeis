package irvine.oeis.a221;

import irvine.oeis.LinearRecurrence;

/**
 * A221882 Number of order-preserving or order-reversing full contraction mappings of <code>an</code> n-chain.
 * @author Sean A. Irvine
 */
public class A221882 extends LinearRecurrence {

  /** Construct the sequence. */
  public A221882() {
    super(new long[] {-4, 12, -13, 6}, new long[] {1, 4, 13, 36});
  }
}
