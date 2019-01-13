package irvine.oeis.a273;

import irvine.oeis.LinearRecurrence;

/**
 * A273365.
 * @author Sean A. Irvine
 */
public class A273365 extends LinearRecurrence {

  /** Construct the sequence. */
  public A273365() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {0, 6, 14, 32, 48});
  }
}
