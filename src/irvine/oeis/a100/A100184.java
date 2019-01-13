package irvine.oeis.a100;

import irvine.oeis.LinearRecurrence;

/**
 * A100184.
 * @author Sean A. Irvine
 */
public class A100184 extends LinearRecurrence {

  /** Construct the sequence. */
  public A100184() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 16, 64, 164});
  }
}
