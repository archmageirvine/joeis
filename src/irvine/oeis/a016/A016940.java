package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016940 a(n) = (6*n + 2)^8.
 * @author Sean A. Irvine
 */
public class A016940 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016940() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {256, 16777216, 1475789056, 25600000000L, 208827064576L, 1099511627776L, 4347792138496L, 14048223625216L, 39062500000000L});
  }
}
