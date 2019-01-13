package irvine.oeis.a271;

import irvine.oeis.LinearRecurrence;

/**
 * A271828.
 * @author Sean A. Irvine
 */
public class A271828 extends LinearRecurrence {

  /** Construct the sequence. */
  public A271828() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 2, 15, 64});
  }
}
