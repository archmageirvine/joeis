package irvine.oeis.a016;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A016796 a(n) = (3*n + 2)^8.
 * @author Sean A. Irvine
 */
public class A016796 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016796() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {256, 390625, 16777216, 214358881, 1475789056, 6975757441L, 25600000000L, 78310985281L, 208827064576L});
  }
}
