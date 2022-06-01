package irvine.oeis.a017;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A017061 a(n) = (7*n + 6)^9.
 * @author Sean A. Irvine
 */
public class A017061 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017061() {
    super(new long[] {-1, 10, -45, 120, -210, 252, -210, 120, -45, 10}, new long[] {10077696, 10604499373L, 512000000000L, 7625597484987L, 60716992766464L, 327381934393961L, 1352605460594688L, 4605366583984375L, 13537086546263552L, 35452087835576229L});
  }
}
