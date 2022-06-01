package irvine.oeis.a017;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A017396 a(n) = (11*n)^8.
 * @author Sean A. Irvine
 */
public class A017396 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017396() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {0, 214358881, 54875873536L, 1406408618241L, 14048223625216L, 83733937890625L, 360040606269696L, 1235736291547681L, 3596345248055296L});
  }
}
