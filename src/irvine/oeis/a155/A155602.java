package irvine.oeis.a155;

import irvine.oeis.LinearRecurrence;

/**
 * A155602 4^n + 3^n - 1.
 * @author Sean A. Irvine
 */
public class A155602 extends LinearRecurrence {

  /** Construct the sequence. */
  public A155602() {
    super(new long[] {12, -19, 8}, new long[] {1, 6, 24});
  }
}
