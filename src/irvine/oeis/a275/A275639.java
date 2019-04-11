package irvine.oeis.a275;

import irvine.oeis.LinearRecurrence;

/**
 * A275639 Expansion of (1-q)^k/Product_{j=1..k} (1-q^j) for <code>k=5</code>.
 * @author Sean A. Irvine
 */
public class A275639 extends LinearRecurrence {

  /** Construct the sequence. */
  public A275639() {
    super(new long[] {-1, -4, -9, -15, -20, -22, -20, -15, -9, -4}, new long[] {1, -4, 7, -7, 5, -4, 4, -4, 5, -7});
  }
}
