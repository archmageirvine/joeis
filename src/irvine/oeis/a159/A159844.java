package irvine.oeis.a159;

import irvine.oeis.LinearRecurrence;

/**
 * A159844.
 * @author Sean A. Irvine
 */
public class A159844 extends LinearRecurrence {

  /** Construct the sequence. */
  public A159844() {
    super(new long[] {-1, 0, 0, 6, 0, 0}, new long[] {325, 359, 401, 1549, 1795, 2081});
  }
}
