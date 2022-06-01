package irvine.oeis.a017;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A017383 (10*n+9)^7.
 * @author Sean A. Irvine
 */
public class A017383 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017383() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {4782969, 893871739, 17249876309L, 137231006679L, 678223072849L, 2488651484819L, 7446353252589L, 19203908986159L});
  }
}
