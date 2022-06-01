package irvine.oeis.a017;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A017084 a(n) = (8*n + 1)^8.
 * @author Sean A. Irvine
 */
public class A017084 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017084() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {1, 43046721, 6975757441L, 152587890625L, 1406408618241L, 7984925229121L, 33232930569601L, 111429157112001L, 318644812890625L});
  }
}
