package irvine.oeis.a123;

import irvine.oeis.LinearRecurrence;

/**
 * A123188.
 * @author Sean A. Irvine
 */
public class A123188 extends LinearRecurrence {

  /** Construct the sequence. */
  public A123188() {
    super(new long[] {-4, 6, 8, -5}, new long[] {1, 0, 2, -8});
  }
}
