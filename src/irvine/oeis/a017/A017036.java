package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017036 <code>(7*n+4)^8</code>.
 * @author Sean A. Irvine
 */
public class A017036 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017036() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {65536, 214358881, 11019960576L, 152587890625L, 1099511627776L, 5352009260481L, 20047612231936L, 62259690411361L, 167961600000000L});
  }
}
