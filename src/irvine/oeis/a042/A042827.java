package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042827 Denominators of continued fraction convergents to <code>sqrt(944)</code>.
 * @author Sean A. Irvine
 */
public class A042827 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042827() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1123598, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 1, 3, 4, 7, 11, 29, 69, 236, 541, 1318, 1859, 3177, 5036, 13249, 18285, 1110349, 1128634, 3367617, 4496251, 7863868, 12360119, 32584106, 77528331, 265169099, 607866529, 1480902157, 2088768686, 3569670843L, 5658439529L, 14886549901L, 20544989430L});
  }
}
