package irvine.oeis.a287;

import irvine.oeis.LinearRecurrence;

/**
 * A287992.
 * @author Sean A. Irvine
 */
public class A287992 extends LinearRecurrence {

  /** Construct the sequence. */
  public A287992() {
    super(new long[] {-4, 20, -41, 44, -26, 8}, new long[] {1, 26, 129, 444, 1285, 3366});
  }
}
