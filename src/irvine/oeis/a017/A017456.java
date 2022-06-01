package irvine.oeis.a017;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A017456 a(n) = (11*n + 5)^8.
 * @author Sean A. Irvine
 */
public class A017456 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017456() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {390625, 4294967296L, 282429536481L, 4347792138496L, 33232930569601L, 167961600000000L, 645753531245761L, 2044140858654976L, 5595818096650401L});
  }
}
