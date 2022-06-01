package irvine.oeis.a016;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A016820 a(n) = (4*n + 1)^8.
 * @author Sean A. Irvine
 */
public class A016820 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016820() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {1, 390625, 43046721, 815730721, 6975757441L, 37822859361L, 152587890625L, 500246412961L, 1406408618241L});
  }
}
