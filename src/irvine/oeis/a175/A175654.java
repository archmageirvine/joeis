package irvine.oeis.a175;

import irvine.oeis.LinearRecurrence;

/**
 * A175654.
 * @author Sean A. Irvine
 */
public class A175654 extends LinearRecurrence {

  /** Construct the sequence. */
  public A175654() {
    super(new long[] {-6, 1, 3}, new long[] {1, 2, 6});
  }
}
