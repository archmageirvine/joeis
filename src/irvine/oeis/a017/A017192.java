package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017192 <code>a(n) = (9*n + 2)^8</code>.
 * @author Sean A. Irvine
 */
public class A017192 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017192() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {256, 214358881, 25600000000L, 500246412961L, 4347792138496L, 23811286661761L, 96717311574016L, 318644812890625L, 899194740203776L});
  }
}
