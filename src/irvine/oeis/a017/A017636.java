package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017636 (12n+9)^8.
 * @author Sean A. Irvine
 */
public class A017636 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017636() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {43046721, 37822859361L, 1406408618241L, 16815125390625L, 111429157112001L, 513798374428641L, 1853020188851841L, 5595818096650401L, 14774554437890625L});
  }
}
