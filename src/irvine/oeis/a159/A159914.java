package irvine.oeis.a159;

import irvine.oeis.LinearRecurrence;

/**
 * A159914.
 * @author Sean A. Irvine
 */
public class A159914 extends LinearRecurrence {

  /** Construct the sequence. */
  public A159914() {
    super(new long[] {-1, 4, -8, 12, -14, 12, -8, 4}, new long[] {0, 0, 0, 0, 1, 3, 5, 8});
  }
}
