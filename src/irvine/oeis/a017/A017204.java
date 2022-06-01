package irvine.oeis.a017;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A017204 a(n) = (9*n + 3)^8.
 * @author Sean A. Irvine
 */
public class A017204 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017204() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {6561, 429981696, 37822859361L, 656100000000L, 5352009260481L, 28179280429056L, 111429157112001L, 360040606269696L, 1001129150390625L});
  }
}
