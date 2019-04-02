package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017371 a(n) = (10*n + 8)^7.
 * @author Sean A. Irvine
 */
public class A017371 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017371() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {2097152, 612220032, 13492928512L, 114415582592L, 587068342272L, 2207984167552L, 6722988818432L, 17565568854912L});
  }
}
