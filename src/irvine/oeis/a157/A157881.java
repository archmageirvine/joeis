package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157881.
 * @author Sean A. Irvine
 */
public class A157881 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157881() {
    super(new long[] {1, -1443, 1443}, new long[] {0, 152, 219336});
  }
}
