package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017348 a(n) = (10*n + 6)^8.
 * @author Sean A. Irvine
 */
public class A017348 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017348() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {1679616, 4294967296L, 208827064576L, 2821109907456L, 20047612231936L, 96717311574016L, 360040606269696L, 1113034787454976L, 2992179271065856L});
  }
}
