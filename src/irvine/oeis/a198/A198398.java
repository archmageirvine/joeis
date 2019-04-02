package irvine.oeis.a198;

import irvine.oeis.LinearRecurrence;

/**
 * A198398 8^n - 8*n.
 * @author Sean A. Irvine
 */
public class A198398 extends LinearRecurrence {

  /** Construct the sequence. */
  public A198398() {
    super(new long[] {8, -17, 10}, new long[] {1, 0, 48});
  }
}
