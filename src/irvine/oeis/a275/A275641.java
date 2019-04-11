package irvine.oeis.a275;

import irvine.oeis.LinearRecurrence;

/**
 * A275641 Expansion of (1-q)^k/Product_{j=1..k} (1-q^j) for <code>k=7</code>.
 * @author Sean A. Irvine
 */
public class A275641 extends LinearRecurrence {

  /** Construct the sequence. */
  public A275641() {
    super(new long[] {-1, -6, -20, -49, -98, -169, -259, -359, -455, -531, -573, -573, -531, -455, -359, -259, -169, -98, -49, -20, -6}, new long[] {1, -6, 16, -25, 26, -21, 18, -21, 27, -30, 28, -26, 30, -41, 55, -65, 66, -61, 59, -66, 79});
  }
}
