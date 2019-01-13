package irvine.oeis.a225;

import irvine.oeis.LinearRecurrence;

/**
 * A225566.
 * @author Sean A. Irvine
 */
public class A225566 extends LinearRecurrence {

  /** Construct the sequence. */
  public A225566() {
    super(new long[] {-1, 2, -1, 2, -4, 2, -1, 2}, new long[] {2, 4, 6, 12, 18, 24, 36, 48});
  }
}
