package irvine.oeis.a275;

import irvine.oeis.LinearRecurrence;

/**
 * A275640 Expansion of <code>(1-q)^k/Product_{j=1..k} (1-q^j)</code> for <code>k=6</code>.
 * @author Sean A. Irvine
 */
public class A275640 extends LinearRecurrence {

  /** Construct the sequence. */
  public A275640() {
    super(new long[] {-1, -5, -14, -29, -49, -71, -90, -101, -101, -90, -71, -49, -29, -14, -5}, new long[] {1, -5, 11, -14, 12, -9, 9, -13, 20, -26, 27, -25, 26, -33, 43});
  }
}
