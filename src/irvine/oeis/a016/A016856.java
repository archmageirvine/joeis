package irvine.oeis.a016;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A016856 a(n) = (5*n)^8.
 * @author Sean A. Irvine
 */
public class A016856 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016856() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {0, 390625, 100000000, 2562890625L, 25600000000L, 152587890625L, 656100000000L, 2251875390625L, 6553600000000L});
  }
}
