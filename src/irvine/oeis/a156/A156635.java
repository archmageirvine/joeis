package irvine.oeis.a156;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A156635 144*n^2 - n.
 * @author Sean A. Irvine
 */
public class A156635 extends LinearRecurrence {

  /** Construct the sequence. */
  public A156635() {
    super(new long[] {1, -3, 3}, new long[] {143, 574, 1293});
  }
}
