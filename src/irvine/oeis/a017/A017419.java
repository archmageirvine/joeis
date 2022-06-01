package irvine.oeis.a017;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A017419 a(n) = (11*n+2)^7.
 * @author Sean A. Irvine
 */
public class A017419 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017419() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {128, 62748517, 4586471424L, 64339296875L, 435817657216L, 1954897493193L, 6722988818432L, 19203908986159L});
  }
}
