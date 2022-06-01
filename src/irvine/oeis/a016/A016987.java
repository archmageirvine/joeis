package irvine.oeis.a016;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A016987 a(n) = (7*n)^7.
 * @author Sean A. Irvine
 */
public class A016987 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016987() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {0, 823543, 105413504, 1801088541, 13492928512L, 64339296875L, 230539333248L, 678223072849L});
  }
}
