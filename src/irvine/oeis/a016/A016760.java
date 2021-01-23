package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016760 a(n) = (2*n+1)^8.
 * @author Sean A. Irvine
 */
public class A016760 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016760() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {1, 6561, 390625, 5764801, 43046721, 214358881, 815730721, 2562890625L, 6975757441L});
  }
}
