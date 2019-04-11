package irvine.oeis.a014;

import irvine.oeis.LinearRecurrence;

/**
 * A014095 Molien series for real extraspecial group <code>2^{1+2*3}</code> of degree 8 and order 128 formed from tensor products of Pauli matrices <code>(0,1, 1,0)</code> and <code>(1,0, 0,-1)</code>.
 * @author Sean A. Irvine
 */
public class A014095 extends LinearRecurrence {

  /** Construct the sequence. */
  public A014095() {
    super(new long[] {-1, 4, -2, -12, 17, 8, -28, 8, 17, -12, -2, 4}, new long[] {1, 1, 15, 29, 135, 310, 870, 1830, 3993, 7535, 14157, 24427});
  }
}
