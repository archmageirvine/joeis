package irvine.oeis.a209;

import irvine.oeis.LinearRecurrence;

/**
 * A209275.
 * @author Sean A. Irvine
 */
public class A209275 extends LinearRecurrence {

  /** Construct the sequence. */
  public A209275() {
    super(new long[] {-1, 10, -45, 120, -210, 252, -210, 120, -45, 10}, new long[] {1, 45, 8193, 250957, 3029217, 21362301, 106420465, 415866333, 1358612097, 3868151437L});
  }
}
