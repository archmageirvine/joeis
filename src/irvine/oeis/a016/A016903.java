package irvine.oeis.a016;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A016903 a(n) = (5*n + 4)^7.
 * @author Sean A. Irvine
 */
public class A016903 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016903() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {16384, 4782969, 105413504, 893871739, 4586471424L, 17249876309L, 52523350144L, 137231006679L});
  }
}
